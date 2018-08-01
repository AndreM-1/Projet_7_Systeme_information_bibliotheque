package com.bibliotheques.appliweb.webapp.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	
	private String moisCourant;
	
	private String anneeCourante;
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(GestionEditionAction.class);
	
	// ===================== Getters/Setters =====================
	public List<Edition> getListEdition() {
		return listEdition;
	}

	public void setListEdition(List<Edition> listEdition) {
		this.listEdition = listEdition;
	}
	
	public String getMoisCourant() {
		return moisCourant;
	}

	public void setMoisCourant(String moisCourant) {
		this.moisCourant = moisCourant;
	}
	
	public String getAnneeCourante() {
		return anneeCourante;
	}

	public void setAnneeCourante(String anneeCourante) {
		this.anneeCourante = anneeCourante;
	}

	public String doList() {
		LOGGER.info("GestionEditionAction - Méthode doList()");
		Date date =new Date();
		DateFormat dfMois = new SimpleDateFormat("MMM");
		DateFormat dfAnnee = new SimpleDateFormat("yyyy");
		moisCourant=dfMois.format(date);
		anneeCourante=dfAnnee.format(date);
		listEdition=managerFactory.getEditionManager().getListEdition(12);
		return ActionSupport.SUCCESS;
		
	}
}