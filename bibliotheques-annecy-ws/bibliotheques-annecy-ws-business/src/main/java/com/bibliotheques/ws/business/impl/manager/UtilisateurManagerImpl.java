package com.bibliotheques.ws.business.impl.manager;

import javax.inject.Named;

import org.apache.commons.validator.routines.EmailValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.bibliotheques.ws.business.contract.manager.UtilisateurManager;
import com.bibliotheques.ws.business.passwordutils.PasswordUtils;
import com.bibliotheques.ws.model.bean.utilisateur.Utilisateur;
import com.bibliotheques.ws.model.exception.FunctionalException;
import com.bibliotheques.ws.model.exception.NotFoundException;

@Named
public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager {

	private Utilisateur utilisateur;
	private static final int SALT_LENGTH = 30;

	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(UtilisateurManagerImpl.class);

	@Override
	public Utilisateur getUtilisateur(String adresseMail, String motDePasse) throws NotFoundException {

		try {
			utilisateur=getDaoFactory().getUtilisateurDao().getUtilisateur(adresseMail);
		} catch (NotFoundException e) {
			LOGGER.info(e.getMessage());
			throw new NotFoundException("Aucun utilisateur correspondant à l'adresse mail demandée.");
		}

		LOGGER.info("Web Service : UtilisateurService - Couche Business - Méthode getUtilisateur - Mot de passe non sécurisé : "+motDePasse);
		LOGGER.info("Web Service : UtilisateurService - Couche Business - Méthode getUtilisateur - Salt : "+utilisateur.getSalt());
		LOGGER.info("Web Service : UtilisateurService - Couche Business - Méthode getUtilisateur - Mot de passe sécurisé : "+utilisateur.getMotDePasseSecurise());

		boolean passwordMatch=PasswordUtils.verifyUserPassword(motDePasse,utilisateur.getMotDePasseSecurise(), utilisateur.getSalt());

		if (passwordMatch) {
			return utilisateur;

		}else {
			LOGGER.info("Web Service : UtilisateurService - Couche Business - Méthode getUtilisateur - Aucun utilisateur correspondant au password fourni.");
			throw new NotFoundException("Mot de passe erroné.");	
		}
	}

	@Override
	public void insertUtilisateur(String civilite, String nom, String prenom, String pseudo,
			String adresseMail, String motDePasse, String confirmationMotDePasse, boolean conditionsUtilisation) throws FunctionalException {

		LOGGER.info("Conditions d'utilisation : "+conditionsUtilisation);
		//On lève une exception si l'un des champs saisis dans le formulaire n'est pas bon.
		if(!conditionsUtilisation) {
			throw new FunctionalException("Veuillez accepter les conditions d'utilisation.");
		}

		if(civilite.trim().isEmpty()||civilite.length()>8) {
			throw new FunctionalException("Le champ civilité n'est pas renseigné correctement.");
		}

		if(nom.trim().isEmpty()|| nom.length()>100) {
			throw new FunctionalException("Le champ nom n'est pas renseigné correctement.");
		}
		
		if(prenom.trim().isEmpty()|| prenom.length()>100) {
			throw new FunctionalException("Le champ prénom n'est pas renseigné correctement.");
		}
		
		if(pseudo.trim().isEmpty()||pseudo.length()>100) {
			throw new FunctionalException("Le champ pseudo n'est pas renseigné correctement.");
		}
		
		if(adresseMail.trim().isEmpty()||adresseMail.length()>100) {
			throw new FunctionalException("Le champ adresse e-mail n'est pas renseigné correctement.");
		}
		
		//Pour l'adresse mail, on vérifie en plus la validité du format.
		if(!EmailValidator.getInstance().isValid(adresseMail)) {
			throw new FunctionalException("Le format saisi pour le champ adresse e-mail est incorrect.");
		}
		
		if(motDePasse.trim().isEmpty()||motDePasse.length()>100 ) {
			throw new FunctionalException("Le champ mot de passe n'est pas renseigné correctement.");
		}
		
		if(confirmationMotDePasse.trim().isEmpty()||confirmationMotDePasse.length()>100) {
			throw new FunctionalException("Le champ confirmationMotDePasse n'est pas renseigné correctement.");
		}
		
		if(!confirmationMotDePasse.equals(motDePasse)) {
			throw new FunctionalException("Le champ confirmationMotDePasse n'est pas renseigné correctement.");
		}
		
		//Si le formulaire est correctement renseigné, alors on lance la transaction.
		TransactionStatus vTransactionStatus= getPlatformTransactionManager().getTransaction(new DefaultTransactionDefinition());
		try {

		//Cryptage Mot de passe.
		String salt=PasswordUtils.getSalt(SALT_LENGTH);
		String mySecurePassword=PasswordUtils.generateSecurePassword(motDePasse, salt);
		LOGGER.info("Web Service : UtilisateurService - Couche Business - Méthode insertUtilisateur - Salt :"+salt);
		LOGGER.info("Web Service : UtilisateurService - Couche Business - Méthode insertUtilisateur - Mot de passe sécurisé : "+mySecurePassword);
		
		//Instanciation et remplissage du bean utilisateur
		utilisateur=new Utilisateur();
		utilisateur.setCivilite(civilite);
		utilisateur.setNom(nom);
		utilisateur.setPrenom(prenom);
		utilisateur.setPseudo(pseudo);
		utilisateur.setAdresseMail(adresseMail);
		utilisateur.setSalt(salt);
		utilisateur.setMotDePasseSecurise(mySecurePassword);	
		utilisateur.setPays("France");
	
		//Appel à la DaoFactory
		getDaoFactory().getUtilisateurDao().insertUtilisateur(utilisateur);
		
		
		} catch (FunctionalException vEx) {
			LOGGER.info(vEx.getMessage());
			getPlatformTransactionManager().rollback(vTransactionStatus);
			throw new FunctionalException(vEx.getMessage());
		} 
		getPlatformTransactionManager().commit(vTransactionStatus);
	}
}