package com.bibliotheques.appliweb.consumer.impl.dao;

import java.util.List;

import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.appliweb.consumer.contract.dao.EditionDao;
import com.bibliotheques.appliweb.model.bean.edition.Edition;


@Named
public class EditionDaoImpl extends AbstractDaoImpl implements EditionDao{
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(EditionDaoImpl.class);
	
	@Override
	public List<Edition> getListEdition(){
		LOGGER.info("Couche Consumer - Méthode getListEdition()");
		//Edition_Service editionService=new Edition_Service();
		return null;
	}
}
