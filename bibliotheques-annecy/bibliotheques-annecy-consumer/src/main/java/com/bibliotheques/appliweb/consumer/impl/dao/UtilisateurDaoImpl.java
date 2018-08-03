package com.bibliotheques.appliweb.consumer.impl.dao;

import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.appliweb.consumer.contract.dao.UtilisateurDao;
import com.bibliotheques.appliweb.consumer.services.generated.utilisateurservice.AuthentifierUtilisateurFault_Exception;
import com.bibliotheques.appliweb.model.bean.utilisateur.Utilisateur;

@Named
public class UtilisateurDaoImpl extends AbstractDaoImpl implements UtilisateurDao {
	
	private Utilisateur utilisateur;
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(UtilisateurDaoImpl.class);
	
	@Override
	public Utilisateur authentifierUtilisateur(String adresseMail, String motDePasse) throws AuthentifierUtilisateurFault_Exception {
		LOGGER.info("Couche Consumer - Méthode authentifierUtilisateur()");
		try {
			utilisateur=getUtilisateurService().authentifierUtilisateur(adresseMail, motDePasse);
		} catch (AuthentifierUtilisateurFault_Exception e) {
			LOGGER.info(e.getMessage());
			throw new AuthentifierUtilisateurFault_Exception(e.getMessage());
		}
		LOGGER.info("Réponse du web service : "+utilisateur);
		return utilisateur;
	}
}