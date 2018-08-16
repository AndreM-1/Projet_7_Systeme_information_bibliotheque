package com.bibliotheques.ws.consumer.contract.dao;

import java.util.List;

import com.bibliotheques.ws.model.bean.edition.Emprunt;
import com.bibliotheques.ws.model.exception.NotFoundException;

/**
 * Interface EmpruntDao
 * @author André Monnier
 *
 */
public interface EmpruntDao {

	/**
	 * Méthode permettant de renvoyer la liste des emprunts d'un utilisateur.
	 * @param utilisateurId : L'identifiant de l'utilisateur
	 * @return List
	 * @throws NotFoundException
	 */
	List<Emprunt> getListEmprunt(int utilisateurId) throws NotFoundException;

}