package com.bibliotheques.appliweb.webapp.action;

import java.util.List;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.appliweb.business.contract.ManagerFactory;
import com.bibliotheques.appliweb.model.bean.edition.Edition;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Classe d'action relative à la gestion des éditions.
 * @author André Monnier
 */
public class GestionEditionAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -43521009919435581L;
	
	@Inject
	private ManagerFactory managerFactory;
	
	// ----- Paramètres
	private List<Edition> listEdition;
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(GestionEditionAction.class);
	
	public String doList() {
		LOGGER.info("GestionEditionAction - Méthode doList()");
		listEdition=managerFactory.getEditionManager().getListEdition();
		return ActionSupport.SUCCESS;
		
	}
}