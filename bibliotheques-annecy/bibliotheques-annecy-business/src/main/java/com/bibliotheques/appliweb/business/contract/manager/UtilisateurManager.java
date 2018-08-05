package com.bibliotheques.appliweb.business.contract.manager;

import com.bibliotheques.appliweb.consumer.generated.utilisateurservice.AuthentifierUtilisateurFault_Exception;
import com.bibliotheques.appliweb.consumer.generated.utilisateurservice.CreerCompteUtilisateurFault_Exception;
import com.bibliotheques.appliweb.model.bean.utilisateur.Utilisateur;

public interface UtilisateurManager {

	Utilisateur authentifierUtilisateur(String adresseMail, String motDePasse) throws AuthentifierUtilisateurFault_Exception;

	Utilisateur creerCompteUtilisateur(String civilite, String nom, String prenom, String pseudo, String adresseMail, String motDePasse,
			String confirmationMotDePasse, boolean conditionsUtilisation) throws CreerCompteUtilisateurFault_Exception;

}