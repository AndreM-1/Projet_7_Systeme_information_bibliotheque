package com.bibliotheques.ws.business.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.bibliotheques.ws.business.contract.ManagerFactory;
import com.bibliotheques.ws.business.contract.manager.EditionManager;
import com.bibliotheques.ws.business.contract.manager.UtilisateurManager;


/**
 * Implémentation de la {@link ManagerFactory}.
 */
@Named
public class ManagerFactoryImpl implements ManagerFactory {
	
	@Inject
	private EditionManager editionManager;
	
	@Inject
	private UtilisateurManager utilisateurManager;

	@Override
	public EditionManager getEditionManager() {
		return editionManager;
	}

	@Override
	public void setEditionManager(EditionManager editionManager) {
		this.editionManager = editionManager;
	}

	@Override
	public UtilisateurManager getUtilisateurManager() {
		return utilisateurManager;
	}

	@Override
	public void setUtilisateurManager(UtilisateurManager utilisateurManager) {
		this.utilisateurManager = utilisateurManager;
	}
	
}