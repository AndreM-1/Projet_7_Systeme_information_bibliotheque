package com.bibliotheques.ws.consumer.impl.rowmapper.edition;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;

import com.bibliotheques.ws.model.bean.edition.Edition;

public class EditionRM implements RowMapper<Edition>{

	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(EditionRM.class);

	@Override
	public Edition mapRow(ResultSet pRS, int pRowNum) throws SQLException {
		Edition vEdition=new Edition();
		vEdition.setId(pRS.getInt("id"));
		vEdition.setIsbn(pRS.getString("isbn"));
		
		//Conversion du format Date en format XMLGregorianCalendar
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTime(pRS.getDate("date_parution"));
        XMLGregorianCalendar xmlCalendar = null;
        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
            vEdition.setDateParution(xmlCalendar);
        } catch (DatatypeConfigurationException ex) {
            LOGGER.info("Problème de conversion du format Date en format XMLGregorianCalendar");
        }
		
		vEdition.setNbPages(pRS.getInt("nb_pages"));
		vEdition.setFormat(pRS.getString("format"));
		return vEdition;
	}
}
