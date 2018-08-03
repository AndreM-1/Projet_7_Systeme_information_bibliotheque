package com.bibliotheques.appliweb.consumer.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.bibliotheques.appliweb.consumer.contract.DaoFactory;
import com.bibliotheques.appliweb.consumer.contract.dao.EditionDao;
import com.bibliotheques.appliweb.consumer.contract.dao.UtilisateurDao;


/**
 * Implémentation de la {@link DaoFactory}
 */
@Named
public class DaoFactoryImpl implements DaoFactory{
	
	@Inject
	private EditionDao editionDao;
	
	@Inject
	private UtilisateurDao utilisateurDao;

	@Override
	public EditionDao getEditionDao() {
		return editionDao;
	}

	@Override
	public void setEditionDao(EditionDao editionDao) {
		this.editionDao = editionDao;
	}

	@Override
	public UtilisateurDao getUtilisateurDao() {
		return utilisateurDao;
	}

	@Override
	public void setUtilisateurDao(UtilisateurDao utilisateurDao) {
		this.utilisateurDao = utilisateurDao;
	}
}