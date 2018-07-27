package com.bibliotheques.ws.webapp.services.impl.edition;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibliotheques.ws.webapp.services.generated.edition.Edition;
import com.bibliotheques.ws.webapp.services.generated.edition.EditionService;


@WebService(endpointInterface="com.bibliotheques.ws.webapp.services.generated.edition.EditionService",serviceName = "edition")
public class EditionServiceImpl implements EditionService{
	
	/**
	 * On utilise le bean edition figurant dans le package généré par wsimport
	 */
	private List<Edition> listEdition;
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(EditionServiceImpl.class);

	public List<Edition> getListEdition(Integer nbEdition){
		LOGGER.info("Web service - Méthode getListEdition()");
		listEdition = new ArrayList<>();
		listEdition.add(new Edition(1,"978-2-7024-3648-6",new Date(),240,"11cm x 17cm"));
		listEdition.add(new Edition(2,"979-1-0900-8589-3",new Date(),650,"15cm x 22cm"));
		return listEdition;
	}
}