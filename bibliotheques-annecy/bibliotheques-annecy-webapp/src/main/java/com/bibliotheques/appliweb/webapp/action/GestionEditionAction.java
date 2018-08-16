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
import com.bibliotheques.appliweb.model.bean.edition.Exemplaire;
import com.bibliotheques.appliweb.model.exception.GetListExemplaireFault_Exception;
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
	
	private List<Exemplaire> listExemplaire;
	private int id;
	private Boolean exemplaireTrouve=false;
	
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
	
	public List<Exemplaire> getListExemplaire() {
		return listExemplaire;
	}

	public void setListExemplaire(List<Exemplaire> listExemplaire) {
		this.listExemplaire = listExemplaire;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Boolean getExemplaireTrouve() {
		return exemplaireTrouve;
	}

	public void setExemplaireTrouve(Boolean exemplaireTrouve) {
		this.exemplaireTrouve = exemplaireTrouve;
	}

	/**
	 * Méthode permettant de renvoyer une liste d'éditions
	 * qui seront affichées sur la page d'accueil
	 * @return success
	 */
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
	
	/**
	 * Méthode permettant d'afficher le détail d'une {@link Edition}
	 * avec notamment le nombre d'exemplaires disponibles par bibliothèque
	 * @return success /error
	 */
	public String doDetail() {
		LOGGER.info("GestionEditionAction - Méthode doDetail()");
		String vResult;
		
		try {
			listExemplaire=managerFactory.getExemplaireManager().getListExemplaire(id);
			
			for (Exemplaire vExemplaire : listExemplaire) {
				if(vExemplaire.getNbExemplaires()!=0) {
					exemplaireTrouve=true;
				}
			}
			vResult=ActionSupport.SUCCESS;
		} catch (GetListExemplaireFault_Exception e) {
			LOGGER.info(e.getMessage());
			this.addActionError(e.getMessage());
			vResult=ActionSupport.ERROR;
		}
		return vResult;
	}
}