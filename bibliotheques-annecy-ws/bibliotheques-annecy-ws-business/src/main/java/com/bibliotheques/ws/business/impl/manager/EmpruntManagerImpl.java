package com.bibliotheques.ws.business.impl.manager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.bibliotheques.ws.business.contract.manager.EmpruntManager;
import com.bibliotheques.ws.model.bean.edition.Emprunt;
import com.bibliotheques.ws.model.exception.FunctionalException;
import com.bibliotheques.ws.model.exception.NotFoundException;
import com.bibliotheques.ws.model.exception.TechnicalException;

@Named
public class EmpruntManagerImpl extends AbstractManager implements EmpruntManager {

	private List<Emprunt> listEmprunt= new ArrayList<>();
	private Emprunt emprunt;
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(EmpruntManagerImpl.class);
	
	@Override
	public List<Emprunt> getListEmprunt(int utilisateurId) throws NotFoundException{
		LOGGER.info("Web Service : EditionService - Couche Business - Méthode getListEmprunt()");
		try {
			listEmprunt=getDaoFactory().getEmpruntDao().getListEmprunt(utilisateurId);
		} catch (NotFoundException e) {
			LOGGER.info(e.getMessage());
			throw new NotFoundException(e.getMessage());
		}
		return listEmprunt;
	}
	
	@Override
	public void emprunterEdition(int utilisateurId, int bibliothequeId, int editionId) throws FunctionalException, TechnicalException{
		LOGGER.info("Web Service : EditionService - Couche Business - Méthode emprunterEdition()");
		
		//Utilisation d'un TransactionStatus. On a besoin de lever une FunctionalException et une TechnicalException,
		//ce qui n'est pas possible avec l'utilisation d'une classe anonyme du transaction template.
		TransactionStatus vTransactionStatus= getPlatformTransactionManager().getTransaction(new DefaultTransactionDefinition());
		
		//En premier, on va mettre à jour la table exemplaire.
		try {
			getDaoFactory().getExemplaireDao().updateNbExemplaire(bibliothequeId, editionId);
		} catch (TechnicalException e) {
			LOGGER.info(e.getMessage());
			getPlatformTransactionManager().rollback(vTransactionStatus);
			throw new TechnicalException(e.getMessage());
		}
		
		//Si la mise à jour de la table exemplaire a marché, on va mettre à jour la table emprunt.
		Date dateDeDebut;
		Date dateDeFin;
		
		//On définit un SimpleDateFormat.
		DateFormat dfTest = new SimpleDateFormat("dd/MM/yyyy");
		
		//Calendar.getInstance() permet de récupérer la date d'aujourd'hui.
		Calendar calendarDebutFin = Calendar.getInstance();
		dateDeDebut=calendarDebutFin.getTime();
		
		//Grâce au SimpleDateFormat, on affiche la date en format chaîne de caractères pour vérifier si on a le résultat attendu.
		//On vérifie que la date de début est correcte.
		LOGGER.info("Date de début :"+dfTest.format(dateDeDebut));
		
		//La durée de l'emprunt peut être égale à 1, 2, 3 ou 4 semaines. On convertit cette durée en jours.
		int dureeMaxEmpruntJours=0;
		switch(getDureeMaxEmprunt()){
			case "1 semaine":
				dureeMaxEmpruntJours=7;
				break;
			case "1semaine":
				dureeMaxEmpruntJours=7;
				break;	
			case "2 semaines":
				dureeMaxEmpruntJours=14;
				break;
			case "2semaines":
				dureeMaxEmpruntJours=14;
				break;	
			case "3 semaines":
				dureeMaxEmpruntJours=21;
				break;
			case "3semaines":
				dureeMaxEmpruntJours=21;
				break;
			case "4 semaines":
				dureeMaxEmpruntJours=28;
				break;
			case "4semaines":
				dureeMaxEmpruntJours=28;
				break;
			default:LOGGER.info("Erreur lors de la conversion de la durée de l'emprunt en jours.");	
		}
		LOGGER.info("Durée max de l'emprunt convertit en jours : "+dureeMaxEmpruntJours);
		
		//On ajoute la durée de l'emprunt à la date de début.
		calendarDebutFin.add(Calendar.DATE,dureeMaxEmpruntJours);
		
		//On vérifie que la date de fin est correcte.
		dateDeFin=calendarDebutFin.getTime();
		LOGGER.info("Date de fin :"+dfTest.format(dateDeFin));
		
		//Par défaut, lors de l'emprunt d'une édition, prolongation est égal à true et statutEmpruntId à 1.
		boolean prolongation=true;
		int statutEmpruntId=1;
		
		try {
			getDaoFactory().getEmpruntDao().insertEmprunt(dateDeDebut,dateDeFin,prolongation, utilisateurId,statutEmpruntId, bibliothequeId,editionId);
			getPlatformTransactionManager().commit(vTransactionStatus);
		} catch (FunctionalException e) {
			LOGGER.info(e.getMessage());
			getPlatformTransactionManager().rollback(vTransactionStatus);
			throw new FunctionalException (e.getMessage());
		}
	}
	
	@Override
	public void prolongerEmprunt(int utilisateurId, int bibliothequeId, int editionId) throws TechnicalException  {
		LOGGER.info("Web Service : EditionService - Couche Business - Méthode prolongerEmprunt()");
		
		//Utilisation d'un TransactionStatus. On a besoin de lever une TechnicalException, ce qui
		//n'est pas possible avec l'utilisation d'une classe anonyme du transaction template.
		TransactionStatus vTransactionStatus= getPlatformTransactionManager().getTransaction(new DefaultTransactionDefinition());
		
		//On récupère tout d'abord un objet de type Emprunt à partir des variables utilisateurId et editionId, ce qui est suffisant
		//vu qu'on a défini un index unique sur les colonnes correspondantes dans la BDD.
		try {
			emprunt=getDaoFactory().getEmpruntDao().getEmprunt(utilisateurId,editionId);
		} catch (NotFoundException e) {
			LOGGER.info(e.getMessage());
			getPlatformTransactionManager().rollback(vTransactionStatus);
			throw new TechnicalException ("Erreur technique lors de l'accès en base de données.");	
		}
		
		//Si on arrive a récupérer un objet de type Emprunt, alors on va mettre à jour la même table après modifications de certains champs.
		Date dateDeFin;
		
		//On définit un SimpleDateFormat.
		DateFormat dfTest = new SimpleDateFormat("dd/MM/yyyy");
		
		//On convertit l'objet XMLGregorianCalendar en GregorianCalendar qui hérite de la classe Calendar.
		Calendar calendar=emprunt.getDateDeFin().toGregorianCalendar();
		
		//La durée de l'emprunt peut être égale à 1, 2, 3 ou 4 semaines. On convertit cette durée en jours.
		int dureeMaxEmpruntJours=0;
		switch(getDureeMaxEmprunt()){
			case "1 semaine":
				dureeMaxEmpruntJours=7;
				break;
			case "1semaine":
				dureeMaxEmpruntJours=7;
				break;	
			case "2 semaines":
				dureeMaxEmpruntJours=14;
				break;
			case "2semaines":
				dureeMaxEmpruntJours=14;
				break;	
			case "3 semaines":
				dureeMaxEmpruntJours=21;
				break;
			case "3semaines":
				dureeMaxEmpruntJours=21;
				break;
			case "4 semaines":
				dureeMaxEmpruntJours=28;
				break;
			case "4semaines":
				dureeMaxEmpruntJours=28;
				break;
			default:LOGGER.info("Erreur lors de la conversion de la durée de l'emprunt en jours.");	
		}
		LOGGER.info("Durée max de l'emprunt convertit en jours : "+dureeMaxEmpruntJours);
		
		//La date de fin après prolongation sera égale à la date de fin initiale + la durée de la prolongation.
		calendar.add(Calendar.DATE, dureeMaxEmpruntJours);
		
		//On vérifie que la date de fin est correcte.
		dateDeFin=calendar.getTime();
		LOGGER.info("Date de fin recalculé :"+dfTest.format(dateDeFin));
		
		//Par défaut, lors de la prolongation de l'emprunt d'une édition, on a les valeurs ci-dessous :
		boolean prolongation=false;
		Date dateDeProlongation=new Date();
		String dureeProlongation=getDureeMaxEmprunt();
		int statutEmpruntId=1;
		
		try {
			getDaoFactory().getEmpruntDao().updateEmprunt(dateDeFin,prolongation,dateDeProlongation,dureeProlongation,utilisateurId, statutEmpruntId,bibliothequeId, editionId);
			getPlatformTransactionManager().commit(vTransactionStatus);
		} catch (TechnicalException e) {
			LOGGER.info(e.getMessage());
			getPlatformTransactionManager().rollback(vTransactionStatus);
			throw new TechnicalException(e.getMessage());
		}	
	}
	
	@Override
	public List<Emprunt> getListEmpruntEnRetard() throws NotFoundException{
		LOGGER.info("Web Service : EditionService - Couche Business - Méthode getListEmpruntEnRetard()");
		try {
			listEmprunt=getDaoFactory().getEmpruntDao().getListEmpruntEnRetard();
		} catch (NotFoundException e) {
			LOGGER.info(e.getMessage());
			throw new NotFoundException(e.getMessage());
		}
		return listEmprunt;
	}
}
