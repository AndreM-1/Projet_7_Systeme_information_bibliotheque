package com.bibliotheques.appliweb.consumer.contract.dao;

import com.bibliotheques.appliweb.consumer.services.generated.utilisateurservice.AuthentifierUtilisateurFault_Exception;
import com.bibliotheques.appliweb.model.bean.utilisateur.Utilisateur;

public interface UtilisateurDao {

	Utilisateur authentifierUtilisateur(String adresseMail, String motDePasse) throws AuthentifierUtilisateurFault_Exception;

}