package com.bibliotheques.appliweb.consumer.impl.dao;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.bibliotheques.appliweb.consumer.services.generated.editionservice.EditionService;
import com.bibliotheques.appliweb.consumer.services.generated.utilisateurservice.UtilisateurService;

/**
 * Classe permettant de définir des objets de type {@link EditionService} et {@link UtilisateurService}
 * qui seront utilisés par les implémentations de la couche Dao pour appeler les méthodes de ces web services.
 * @author André Monnier
 */
public abstract class AbstractDaoImpl {

	private EditionService editionService;
	
	private UtilisateurService utilisateurService;

	public EditionService getEditionService() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setAddress("http://localhost:8080/bibliotheques-annecy-ws-webapp/ws/edition");
        factory.setServiceClass(EditionService.class);
        editionService=(EditionService)factory.create();
		return editionService;
	}
	
	public UtilisateurService getUtilisateurService() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setAddress("http://localhost:8080/bibliotheques-annecy-ws-webapp/ws/utilisateur");
		factory.setServiceClass(UtilisateurService.class);
		utilisateurService=(UtilisateurService)factory.create();
		return utilisateurService;
	}
}