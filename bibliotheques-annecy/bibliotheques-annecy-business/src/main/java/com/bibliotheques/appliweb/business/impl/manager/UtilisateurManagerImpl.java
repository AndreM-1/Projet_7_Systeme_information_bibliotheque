package com.bibliotheques.appliweb.business.impl.manager;

import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.appliweb.business.contract.manager.UtilisateurManager;
import com.bibliotheques.appliweb.consumer.generated.utilisateurservice.AuthentifierUtilisateurFault_Exception;
import com.bibliotheques.appliweb.consumer.generated.utilisateurservice.CreerCompteUtilisateurFault_Exception;
import com.bibliotheques.appliweb.model.bean.utilisateur.Utilisateur;

@Named
public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager{

	private Utilisateur utilisateur;

	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(UtilisateurManagerImpl.class);

	@Override
	public Utilisateur authentifierUtilisateur(String adresseMail, String motDePasse) throws AuthentifierUtilisateurFault_Exception {
		LOGGER.info("Couche Business - Méthode authentifierUtilisateur()");
		try {
			utilisateur=getDaoFactory().getUtilisateurDao().authentifierUtilisateur(adresseMail,motDePasse);
		} catch (AuthentifierUtilisateurFault_Exception e) {
			LOGGER.info(e.getMessage());
			throw new AuthentifierUtilisateurFault_Exception(e.getMessage());
		}
		return utilisateur;
	}

	@Override
	public Utilisateur creerCompteUtilisateur(String civilite, String nom, String prenom, String pseudo,
			String adresseMail, String motDePasse, String confirmationMotDePasse, boolean conditionsUtilisation) throws CreerCompteUtilisateurFault_Exception {
		LOGGER.info("Couche Business - Méthode creerCompteUtilisateur()");
		
		try {
			utilisateur=getDaoFactory().getUtilisateurDao().creerCompteUtilisateur(civilite, nom, prenom, pseudo,
					adresseMail, motDePasse, confirmationMotDePasse, conditionsUtilisation);
		} catch (CreerCompteUtilisateurFault_Exception e) {
			LOGGER.info(e.getMessage());
			throw new CreerCompteUtilisateurFault_Exception(e.getMessage());
		}
		
		return utilisateur;
	}
}