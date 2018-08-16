package com.bibliotheques.appliweb.business.contract.manager;

import java.util.List;

import com.bibliotheques.appliweb.model.bean.edition.Emprunt;
import com.bibliotheques.appliweb.model.exception.GestionPretFault_Exception;

/**
 * Interface EmpruntManager
 * @author André Monnier
 *
 */
public interface EmpruntManager {

	/**
	 * Méthode permettant de visualiser les prêts effectués par un utilisateur
	 * @param utilisateurId : L'identifiant de l'utilisateur
	 * @return List
	 * @throws GestionPretFault_Exception
	 */
	List<Emprunt> gestionPret(int utilisateurId) throws GestionPretFault_Exception;

}