package com.bibliotheques.ws.business.contract.manager;

import java.util.List;

import com.bibliotheques.ws.model.bean.edition.Edition;

/**
 * Interface EditionManager
 * @author André Monnier
 *
 */
public interface EditionManager {

	/**
	 * Méthode permettant de renvoyer la liste des éditions.
	 * @param nbEdition : Le nombre d'éditions souhaité.
	 * @return List
	 */
	List<Edition> getListEdition(int nbEdition);

}