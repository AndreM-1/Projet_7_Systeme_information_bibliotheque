package com.bibliotheques.ws.webapp.editionservice.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.ws.business.contract.ManagerFactory;
import com.bibliotheques.ws.model.bean.edition.Edition;
import com.bibliotheques.ws.model.bean.edition.Exemplaire;
import com.bibliotheques.ws.model.exception.FunctionalException;
import com.bibliotheques.ws.model.exception.NotFoundException;
import com.bibliotheques.ws.webapp.editionservice.generated.EditionService;
import com.bibliotheques.ws.webapp.editionservice.generated.GetListExemplaireFault;
import com.bibliotheques.ws.webapp.editionservice.generated.GetListExemplaireFault_Exception;
import com.bibliotheques.ws.webapp.editionservice.generated.RechercheAvanceeEditionFault;
import com.bibliotheques.ws.webapp.editionservice.generated.RechercheAvanceeEditionFault_Exception;
import com.bibliotheques.ws.webapp.editionservice.generated.RechercheEditionFault;
import com.bibliotheques.ws.webapp.editionservice.generated.RechercheEditionFault_Exception;


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

	@Override
	public List<Edition> rechercheEdition(String titre) throws RechercheEditionFault_Exception {
		LOGGER.info("Web Service : EditionService - Couche Webapp - Méthode rechercheEdition()");
		listEdition = new ArrayList<>();
		try {
			listEdition=managerFactory.getEditionManager().rechercheEdition(titre);
		} catch (NotFoundException e) {
			LOGGER.info(e.getMessage());
			RechercheEditionFault rechercheEditionFault =new RechercheEditionFault();
			rechercheEditionFault.setFaultMessageErreur(e.getMessage());
			throw new RechercheEditionFault_Exception(e.getMessage(),rechercheEditionFault);
		}
		return listEdition;
	}

	@Override
	public List<Edition> rechercheAvanceeEdition(String titre, String nomAuteur, String nomEditeur,
			String anneeParution, String genre) throws RechercheAvanceeEditionFault_Exception {
		LOGGER.info("Web Service : EditionService - Couche Webapp - Méthode rechercheAvanceeEdition()");
		listEdition = new ArrayList<>();
		try {
			listEdition=managerFactory.getEditionManager().rechercheAvanceeEdition(titre, nomAuteur, nomEditeur, anneeParution, genre);
		} catch (NotFoundException e) {
			LOGGER.info(e.getMessage());
			RechercheAvanceeEditionFault rechercheAvanceeEditionFault =new RechercheAvanceeEditionFault();
			rechercheAvanceeEditionFault.setFaultMessageErreur(e.getMessage());
			throw new RechercheAvanceeEditionFault_Exception(e.getMessage(),rechercheAvanceeEditionFault);
		} catch (FunctionalException e) {
			LOGGER.info(e.getMessage());
			RechercheAvanceeEditionFault rechercheAvanceeEditionFault =new RechercheAvanceeEditionFault();
			rechercheAvanceeEditionFault.setFaultMessageErreur(e.getMessage());
			throw new RechercheAvanceeEditionFault_Exception(e.getMessage(),rechercheAvanceeEditionFault);
		}
		return listEdition;
	}
}