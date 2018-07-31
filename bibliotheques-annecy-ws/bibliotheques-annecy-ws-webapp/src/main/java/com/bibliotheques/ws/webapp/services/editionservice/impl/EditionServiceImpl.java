package com.bibliotheques.ws.webapp.services.editionservice.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.ws.business.contract.ManagerFactory;
import com.bibliotheques.ws.model.bean.edition.Edition;
import com.bibliotheques.ws.webapp.services.editionservice.generated.EditionService;




public class EditionServiceImpl implements EditionService{
	
	@Inject
	private ManagerFactory managerFactory;
	
	// ----- Paramètres
	private List<Edition> listEdition;
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(EditionServiceImpl.class);

	@Override
	public List<Edition> getListEdition(int nbEdition) {
		LOGGER.info("Web service - Méthode getListEdition()");
		listEdition = new ArrayList<>();		
		LOGGER.info("Web Service : EditionService - Couche Webapp - Méthode getListEdition()");
		listEdition=managerFactory.getEditionManager().getListEdition(nbEdition);
		return listEdition;
	}
}