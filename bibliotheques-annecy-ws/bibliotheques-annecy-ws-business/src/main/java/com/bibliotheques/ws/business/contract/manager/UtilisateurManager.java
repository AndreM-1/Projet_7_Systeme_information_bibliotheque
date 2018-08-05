package com.bibliotheques.ws.business.contract.manager;

import com.bibliotheques.ws.model.bean.utilisateur.Utilisateur;
import com.bibliotheques.ws.model.exception.FunctionalException;
import com.bibliotheques.ws.model.exception.NotFoundException;

public interface UtilisateurManager {

	Utilisateur getUtilisateur(String adresseMail, String motDePasse) throws NotFoundException;

	void insertUtilisateur(String civilite, String nom, String prenom, String pseudo, String adresseMail, String motDePasse, String confirmationMotDePasse,
			boolean conditionsUtilisation) throws FunctionalException;

}