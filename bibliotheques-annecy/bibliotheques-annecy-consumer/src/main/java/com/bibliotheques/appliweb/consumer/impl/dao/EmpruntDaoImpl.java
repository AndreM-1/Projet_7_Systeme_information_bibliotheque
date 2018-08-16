package com.bibliotheques.appliweb.consumer.impl.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.appliweb.consumer.contract.dao.EmpruntDao;
import com.bibliotheques.appliweb.model.bean.edition.Emprunt;
import com.bibliotheques.appliweb.model.exception.GestionPretFault_Exception;

@Named
public class EmpruntDaoImpl extends AbstractDaoImpl implements EmpruntDao{
	
	private List<Emprunt> listEmprunt = new ArrayList<>();
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(EmpruntDaoImpl.class);
	
	
	@Override
	public List<Emprunt> gestionPret(int utilisateurId) throws GestionPretFault_Exception{
		LOGGER.info("Couche Consumer - Méthode gestionPret()");
		try {
			listEmprunt=getEditionService().gestionPret(utilisateurId);
		} catch (GestionPretFault_Exception e) {
			LOGGER.info(e.getMessage());
			throw new GestionPretFault_Exception(e.getMessage());
		}
		return listEmprunt;
	}
}