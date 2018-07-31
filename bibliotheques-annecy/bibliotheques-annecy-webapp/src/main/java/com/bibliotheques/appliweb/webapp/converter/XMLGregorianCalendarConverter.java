package com.bibliotheques.appliweb.webapp.converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.util.StrutsTypeConverter;

public class XMLGregorianCalendarConverter extends StrutsTypeConverter {
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(XMLGregorianCalendarConverter.class);

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		LOGGER.info("XMLGregorianCalendarConverter : Appel de la méthode convertFromString ");
		return null;
	}

	@Override
	public String convertToString(Map context, Object o) {
		LOGGER.info("XMLGregorianCalendarConverter : Appel de la méthode convertToString ");
		String vRetour=null;
		if(o instanceof XMLGregorianCalendar) {
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			XMLGregorianCalendar vXMLGregorianCalendar=(XMLGregorianCalendar)o;
			vRetour=df.format(vXMLGregorianCalendar.toGregorianCalendar().getTime());	
		}else {
			vRetour="";
		}
		return vRetour;
	}
}