package com.bibliotheques.appliweb.consumer.impl.dao;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.appliweb.consumer.contract.dao.EditionDao;
import com.bibliotheques.appliweb.model.bean.edition.Edition;


@Named
public class EditionDaoImpl extends AbstractDaoImpl implements EditionDao{
	
	private List<Edition> listEdition=new ArrayList<>();
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(EditionDaoImpl.class);

	
	@Override
	public List<Edition> getListEdition(int nbEdition){
		LOGGER.info("Couche Consumer - Méthode getListEdition()");
		listEdition=getEditionService().getListEdition(nbEdition);
    	LOGGER.info("Réponse du web service : "+listEdition);
		return listEdition;
	}
}
