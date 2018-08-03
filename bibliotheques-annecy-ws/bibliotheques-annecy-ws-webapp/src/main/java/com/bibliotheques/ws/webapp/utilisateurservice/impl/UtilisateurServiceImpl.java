package com.bibliotheques.ws.webapp.utilisateurservice.impl;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.ws.business.contract.ManagerFactory;
import com.bibliotheques.ws.model.bean.utilisateur.Utilisateur;
import com.bibliotheques.ws.model.exception.NotFoundException;
import com.bibliotheques.ws.webapp.utilisateurservice.generated.AuthentifierUtilisateurFault;
import com.bibliotheques.ws.webapp.utilisateurservice.generated.AuthentifierUtilisateurFault_Exception;
import com.bibliotheques.ws.webapp.utilisateurservice.generated.CreerCompteUtilisateurFault_Exception;
import com.bibliotheques.ws.webapp.utilisateurservice.generated.UpdateCoordUtilisateurFault_Exception;
import com.bibliotheques.ws.webapp.utilisateurservice.generated.UpdateMdpUtilisateurFault_Exception;
import com.bibliotheques.ws.webapp.utilisateurservice.generated.UtilisateurService;

public class UtilisateurServiceImpl implements UtilisateurService {

	@Inject
	private ManagerFactory managerFactory;

	// ----- Paramètres
	private Utilisateur utilisateur;

	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(UtilisateurServiceImpl.class);

	@Override
	public Utilisateur authentifierUtilisateur(String adresseMail, String motDePasse)
			throws AuthentifierUtilisateurFault_Exception {
		LOGGER.info("Web service - Méthode authentifierUtilisateur()");
		LOGGER.info("Adresse mail :"+adresseMail);
		LOGGER.info("Mot de Passe :"+motDePasse);

		if (!StringUtils.isAllEmpty(adresseMail, motDePasse)) {
			try {
				utilisateur=managerFactory.getUtilisateurManager().getUtilisateur(adresseMail,motDePasse);
			} catch (NotFoundException pEx) {
				LOGGER.info(pEx.getMessage());
				AuthentifierUtilisateurFault authentifierUtilisateurFault=new AuthentifierUtilisateurFault();
				authentifierUtilisateurFault.setFaultMessageErreur(pEx.getMessage());
				throw new AuthentifierUtilisateurFault_Exception("Identifiant ou mot de passe invalide !",authentifierUtilisateurFault);
			}
		}else {
			AuthentifierUtilisateurFault authentifierUtilisateurFault=new AuthentifierUtilisateurFault();
			authentifierUtilisateurFault.setFaultMessageErreur("L'identifiant et le mot de passe ne sont pas renseignés.");
			throw new AuthentifierUtilisateurFault_Exception("Champs non renseignés.",authentifierUtilisateurFault);
		}

		return utilisateur;
	}


	@Override
	public Utilisateur creerCompteUtilisateur(String civilite, String nom, String prenom, String pseudo,
			String adresseMail, String motDePasse) throws CreerCompteUtilisateurFault_Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMdpUtilisateur(String ancienMdp, String nouveauMdp, String confirmationNouveauMdp)
			throws UpdateMdpUtilisateurFault_Exception {
		// TODO Auto-generated method stub

	}


	@Override
	public void updateCoordUtilisateur(Utilisateur utilisateur) throws UpdateCoordUtilisateurFault_Exception {
		// TODO Auto-generated method stub

	}

}