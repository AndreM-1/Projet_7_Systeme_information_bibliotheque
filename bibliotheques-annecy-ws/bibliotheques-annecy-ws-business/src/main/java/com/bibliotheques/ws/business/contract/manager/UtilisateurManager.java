package com.bibliotheques.ws.business.contract.manager;

import com.bibliotheques.ws.model.bean.utilisateur.Utilisateur;
import com.bibliotheques.ws.model.exception.NotFoundException;

public interface UtilisateurManager {

	Utilisateur getUtilisateur(String adresseMail, String motDePasse) throws NotFoundException;

}