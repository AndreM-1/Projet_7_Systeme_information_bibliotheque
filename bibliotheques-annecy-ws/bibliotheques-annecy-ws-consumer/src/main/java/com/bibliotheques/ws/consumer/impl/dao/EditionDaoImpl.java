package com.bibliotheques.ws.consumer.impl.dao;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bibliotheques.ws.consumer.contract.dao.EditeurDao;
import com.bibliotheques.ws.consumer.contract.dao.EditionDao;
import com.bibliotheques.ws.consumer.contract.dao.GenreDao;
import com.bibliotheques.ws.consumer.contract.dao.OuvrageDao;
import com.bibliotheques.ws.consumer.contract.dao.PhotoDao;
import com.bibliotheques.ws.consumer.impl.rowmapper.edition.EditionRM;
import com.bibliotheques.ws.model.bean.edition.Edition;


@Named
public class EditionDaoImpl extends AbstractDaoImpl implements EditionDao{
	
	@Inject
	private OuvrageDao ouvrageDao;
	
	@Inject
	private PhotoDao photoDao;
	
	@Inject
	private EditeurDao editeurDao;
	
	@Inject
	private GenreDao genreDao;
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(EditionDaoImpl.class);

	
	@Override
	public List<Edition> getListEdition(int nbEdition){
		LOGGER.info("Web Service : EditionService - Couche Consumer - Méthode getListEdition()");
		String vSQL = "SELECT * FROM public.edition ORDER BY date_parution DESC LIMIT "+nbEdition;
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource()); 
		RowMapper<Edition> vRowMapper=new EditionRM(ouvrageDao,photoDao,editeurDao,genreDao);
		List<Edition> vListEdition = vJdbcTemplate.query(vSQL, vRowMapper);

		return vListEdition;
	}
	
	@Override
	public Edition getEdition(int editionId) {
		LOGGER.info("Web Service : EditionService - Couche Consumer - Méthode getEdition()");
		String vSQL="SELECT * FROM public.edition WHERE id="+editionId;
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource()); 
		RowMapper<Edition> vRowMapper=new EditionRM(ouvrageDao,photoDao,editeurDao,genreDao);
		List<Edition> vListEdition=vJdbcTemplate.query(vSQL, vRowMapper);
		return vListEdition.get(0);
	}
}