package com.bibliotheques.ws.business.impl.manager;

import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.ws.business.contract.manager.UtilisateurManager;
import com.bibliotheques.ws.business.passwordutils.PasswordUtils;
import com.bibliotheques.ws.model.bean.utilisateur.Utilisateur;
import com.bibliotheques.ws.model.exception.NotFoundException;

@Named
public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager {
	
	private Utilisateur utilisateur;
	
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
}