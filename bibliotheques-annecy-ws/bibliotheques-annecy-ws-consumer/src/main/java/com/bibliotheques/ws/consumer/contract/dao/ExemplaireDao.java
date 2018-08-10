package com.bibliotheques.ws.consumer.contract.dao;

import java.util.List;

import com.bibliotheques.ws.model.bean.edition.Exemplaire;
import com.bibliotheques.ws.model.exception.NotFoundException;

/**
 * Interface ExemplaireDao
 * @author André Monnier
 *
 */
public interface ExemplaireDao {

	/**
	 * Méthode permettant de renvoyer la liste des exemplaires d'une édition donnée.
	 * @param editionId : L'identifiant de l'édition
	 * @return List
	 * @throws NotFoundException
	 */
	List<Exemplaire> getListExemplaire(int editionId) throws NotFoundException;

}