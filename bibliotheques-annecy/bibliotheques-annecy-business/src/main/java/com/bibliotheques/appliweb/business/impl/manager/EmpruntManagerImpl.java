package com.bibliotheques.appliweb.business.impl.manager;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.appliweb.business.contract.manager.EmpruntManager;
import com.bibliotheques.appliweb.model.bean.edition.Emprunt;
import com.bibliotheques.appliweb.model.exception.GestionPretFault_Exception;

@Named
public class EmpruntManagerImpl extends AbstractManager implements EmpruntManager {
	
	private List<Emprunt> listEmprunt = new ArrayList<>();
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(EmpruntManagerImpl.class);
	
	@Override
	public List<Emprunt> gestionPret(int utilisateurId) throws GestionPretFault_Exception{
		LOGGER.info("Couche Business - Méthode gestionPret()");
		try {
			listEmprunt=getDaoFactory().getEmpruntDao().gestionPret(utilisateurId);
		} catch (GestionPretFault_Exception e) {
			LOGGER.info(e.getMessage());
			throw new GestionPretFault_Exception(e.getMessage());
		}
		return listEmprunt;
	}
}