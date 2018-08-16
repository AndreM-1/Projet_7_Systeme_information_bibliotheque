package com.bibliotheques.ws.business.contract.manager;

import java.util.List;

import com.bibliotheques.ws.model.bean.edition.Emprunt;
import com.bibliotheques.ws.model.exception.NotFoundException;

/**
 * Interface EmpruntManager
 * @author André Monnier
 *
 */
public interface EmpruntManager {

	/**
	 * Méthode permettant de renvoyer la liste des emprunts d'un utilisateur.
	 * @param utilisateurId : L'identifiant de l'utilisateur
	 * @return List
	 * @throws NotFoundException
	 */
	List<Emprunt> getListEmprunt(int utilisateurId) throws NotFoundException;

}