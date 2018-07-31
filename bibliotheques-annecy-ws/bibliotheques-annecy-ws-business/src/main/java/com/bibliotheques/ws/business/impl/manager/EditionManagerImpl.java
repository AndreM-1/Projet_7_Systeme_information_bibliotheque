package com.bibliotheques.ws.business.impl.manager;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.ws.business.contract.manager.EditionManager;
import com.bibliotheques.ws.model.bean.edition.Edition;

@Named
public class EditionManagerImpl extends AbstractManager implements EditionManager {
	
	private List<Edition> listEdition = new ArrayList<>();

	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(EditionManagerImpl.class);
	
	@Override
	public List<Edition> getListEdition(int nbEdition) {
		LOGGER.info("Web Service : EditionService - Couche Business - Méthode getListEdition()");
		listEdition=getDaoFactory().getEditionDao().getListEdition(nbEdition);
		return this.listEdition;
	}
}