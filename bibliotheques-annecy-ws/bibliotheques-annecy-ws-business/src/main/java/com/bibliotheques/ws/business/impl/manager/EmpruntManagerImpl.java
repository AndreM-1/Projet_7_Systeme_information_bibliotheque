package com.bibliotheques.ws.business.impl.manager;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.ws.business.contract.manager.EmpruntManager;
import com.bibliotheques.ws.model.bean.edition.Emprunt;
import com.bibliotheques.ws.model.exception.NotFoundException;

@Named
public class EmpruntManagerImpl extends AbstractManager implements EmpruntManager {

	private List<Emprunt> listEmprunt= new ArrayList<>();
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(EmpruntManagerImpl.class);
	
	@Override
	public List<Emprunt> getListEmprunt(int utilisateurId) throws NotFoundException{
		LOGGER.info("Web Service : EditionService - Couche Business - Méthode getListEmprunt()");
		try {
			listEmprunt=getDaoFactory().getEmpruntDao().getListEmprunt(utilisateurId);
		} catch (NotFoundException e) {
			LOGGER.info(e.getMessage());
			throw new NotFoundException(e.getMessage());
		}
		return listEmprunt;
	}
}
