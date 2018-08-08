package com.bibliotheques.appliweb.consumer.contract.dao;

import java.util.List;

import com.bibliotheques.appliweb.model.bean.edition.Edition;

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
}