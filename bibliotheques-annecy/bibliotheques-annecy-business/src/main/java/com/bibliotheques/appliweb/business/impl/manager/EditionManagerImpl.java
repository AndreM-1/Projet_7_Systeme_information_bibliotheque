package com.bibliotheques.appliweb.business.impl.manager;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.appliweb.business.contract.manager.EditionManager;
import com.bibliotheques.appliweb.model.bean.edition.Edition;

@Named
public class EditionManagerImpl extends AbstractManager implements EditionManager {
	
	private List<Edition> listEdition = new ArrayList<>();

	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(EditionManagerImpl.class);
	
	@Override
	public List<Edition> getListEdition() {
		LOGGER.info("Couche Business - Méthode getListEdition()");
		listEdition=getDaoFactory().getEditionDao().getListEdition();
		return this.listEdition;
	}
}