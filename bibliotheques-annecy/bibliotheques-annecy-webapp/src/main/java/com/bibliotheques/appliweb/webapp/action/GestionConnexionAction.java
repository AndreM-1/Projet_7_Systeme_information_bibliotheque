package com.bibliotheques.appliweb.webapp.action;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.appliweb.business.contract.ManagerFactory;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Classe d'action permettant de gérer la connexion
 * et la déconnexion d'un {@link Utilisateur}
 * @author André Monnier
 */
public class GestionConnexionAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6998580473169565846L;
	
	@Inject
	private ManagerFactory managerFactory;
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(GestionConnexionAction.class);

	
	// ===================== Méthodes ======================

	/**
	 * Méthode permettant la connexion d'un utilisateur. Le but est de ressortir de cette méthode
	 * avec un objet de type {@link Utilisateur} en session
	 * @return input / success
	 */
	public String doLogin()  {
		String vResult=ActionSupport.INPUT;
		return vResult;
	}
}
