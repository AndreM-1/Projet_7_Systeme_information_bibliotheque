package com.bibliotheques.appliweb.consumer.impl.dao;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.bibliotheques.appliweb.consumer.services.generated.editionservice.EditionService;

/**
 * Classe permettant de définir un objet de type {@link EditionService}
 * qui sera utilisé par les implémentations de la couche Dao pour appeler
 * les méthodes des web services.
 * @author André Monnier
 */
public abstract class AbstractDaoImpl {

	private EditionService editionService;

	public EditionService getEditionService() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setAddress("http://localhost:8080/bibliotheques-annecy-ws-webapp/ws/edition");
        factory.setServiceClass(EditionService.class);
        editionService=(EditionService)factory.create();
		return editionService;
	}
}