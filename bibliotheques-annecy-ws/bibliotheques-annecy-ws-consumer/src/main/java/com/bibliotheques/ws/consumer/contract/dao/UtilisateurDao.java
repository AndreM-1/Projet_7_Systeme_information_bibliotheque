package com.bibliotheques.ws.consumer.contract.dao;

import com.bibliotheques.ws.model.bean.utilisateur.Utilisateur;
import com.bibliotheques.ws.model.exception.FunctionalException;
import com.bibliotheques.ws.model.exception.NotFoundException;

public interface UtilisateurDao {

	Utilisateur getUtilisateur(String adresseMail) throws NotFoundException;

	void insertUtilisateur(Utilisateur utilisateur) throws FunctionalException;

}