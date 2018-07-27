package com.bibliotheques.appliweb.business.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.bibliotheques.appliweb.business.contract.ManagerFactory;
import com.bibliotheques.appliweb.business.contract.manager.EditionManager;


/**
 * Implémentation de la {@link ManagerFactory}.
 */
@Named
public class ManagerFactoryImpl implements ManagerFactory {
	
	@Inject
	private EditionManager editionManager;

	@Override
	public EditionManager getEditionManager() {
		return editionManager;
	}

	@Override
	public void setEditionManager(EditionManager editionManager) {
		this.editionManager = editionManager;
	}
}