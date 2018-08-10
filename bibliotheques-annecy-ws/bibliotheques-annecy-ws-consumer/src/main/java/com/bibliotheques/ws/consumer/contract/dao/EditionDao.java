package com.bibliotheques.ws.consumer.contract.dao;

import java.util.List;

import com.bibliotheques.ws.model.bean.edition.Edition;

/**
 * Interface EditionDao
 * @author André Monnier
 *
 */
public interface EditionDao {

	/**
	 * Méthode permettant de renvoyer la liste des éditions.
	 * @param nbEdition : Le nombre d'éditions souhaité.
	 * @return List
	 */
	List<Edition> getListEdition(int nbEdition);

	/**
	 * Méthode permettant de renvoyer un objet de type Edition en fonction de son identifiant.
	 * @param editionId : L'identifiant de l'édition
	 * @return Un objet de type {@link Edition}
	 */
	Edition getEdition(int editionId);

}