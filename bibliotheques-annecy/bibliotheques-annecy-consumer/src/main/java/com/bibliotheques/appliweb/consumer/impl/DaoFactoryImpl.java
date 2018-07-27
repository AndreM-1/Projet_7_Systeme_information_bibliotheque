package com.bibliotheques.appliweb.consumer.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.bibliotheques.appliweb.consumer.contract.DaoFactory;
import com.bibliotheques.appliweb.consumer.contract.dao.EditionDao;


/**
 * Implémentation de la {@link DaoFactory}
 */
@Named
public class DaoFactoryImpl implements DaoFactory{
	
	@Inject
	private EditionDao editionDao;

	@Override
	public EditionDao getEditionDao() {
		return editionDao;
	}

	@Override
	public void setEditionDao(EditionDao editionDao) {
		this.editionDao = editionDao;
	}
	
}