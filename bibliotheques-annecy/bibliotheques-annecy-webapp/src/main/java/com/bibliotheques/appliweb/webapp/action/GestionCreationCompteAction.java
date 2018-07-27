package com.bibliotheques.appliweb.webapp.action;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.appliweb.business.contract.ManagerFactory;
import com.opensymphony.xwork2.ActionSupport;


/**
 * Classe d'action permettant de créer un compte {@link Utilisateur}
 * @author André Monnier
 */
public class GestionCreationCompteAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4250681548714234862L;

	@Inject
	private ManagerFactory managerFactory;

	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(GestionCreationCompteAction.class);


	// ===================== Méthodes =====================

	/**
	 * Méthode permettant la création d'un compte utilisateur
	 * @return input / success / error
	 */
	public String doCreationCompte() {

		// Si (this.utilisateur == null) c'est que l'on entre dans le formulaire de création de compte utilisateur
		// Sinon, c'est que l'on vient de valider le formulaire de création de compte
	
		//Par défaut, le result est "input
		String vResult = ActionSupport.INPUT;
		
		return vResult;
	}
}