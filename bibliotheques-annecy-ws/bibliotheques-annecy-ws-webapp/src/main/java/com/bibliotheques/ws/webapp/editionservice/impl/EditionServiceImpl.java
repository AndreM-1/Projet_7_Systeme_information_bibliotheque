package com.bibliotheques.ws.webapp.editionservice.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.ws.business.contract.ManagerFactory;
import com.bibliotheques.ws.model.bean.edition.Edition;
import com.bibliotheques.ws.model.bean.edition.Exemplaire;
import com.bibliotheques.ws.model.exception.NotFoundException;
import com.bibliotheques.ws.webapp.editionservice.generated.EditionService;
import com.bibliotheques.ws.webapp.editionservice.generated.GetListExemplaireFault;
import com.bibliotheques.ws.webapp.editionservice.generated.GetListExemplaireFault_Exception;


public class EditionServiceImpl implements EditionService{
	
	@Inject
	private ManagerFactory managerFactory;
	
	// ----- Paramètres
	private List<Edition> listEdition;
	private List<Exemplaire> listExemplaire;
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(EditionServiceImpl.class);

	@Override
	public List<Edition> getListEdition(int nbEdition) {
		LOGGER.info("Web Service : EditionService - Couche Webapp - Méthode getListEdition()");
		listEdition = new ArrayList<>();		
		listEdition=managerFactory.getEditionManager().getListEdition(nbEdition);
		return listEdition;
	}

	@Override
	public List<Exemplaire> getListExemplaire(int editionId) throws GetListExemplaireFault_Exception {
		LOGGER.info("Web Service : EditionService - Couche Webapp - Méthode getListExemplaire()");
		listExemplaire=new ArrayList<>();
		try {
			listExemplaire=managerFactory.getExemplaireManager().getListExemplaire(editionId);
		} catch (NotFoundException nfe) {
			LOGGER.info(nfe.getMessage());
			GetListExemplaireFault getListExemplaireFault = new GetListExemplaireFault();
			getListExemplaireFault.setFaultMessageErreur(nfe.getMessage());
			throw new GetListExemplaireFault_Exception(nfe.getMessage(),getListExemplaireFault);
			
		}
		return listExemplaire;
	}
}