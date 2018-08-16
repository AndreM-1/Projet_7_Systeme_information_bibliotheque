package com.bibliotheques.ws.consumer.impl.dao;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bibliotheques.ws.consumer.contract.dao.BibliothequeDao;
import com.bibliotheques.ws.consumer.contract.dao.EditionDao;
import com.bibliotheques.ws.consumer.contract.dao.ExemplaireDao;
import com.bibliotheques.ws.consumer.impl.rowmapper.edition.ExemplaireRM;
import com.bibliotheques.ws.model.bean.edition.Exemplaire;
import com.bibliotheques.ws.model.exception.NotFoundException;

@Named
public class ExemplaireDaoImpl extends AbstractDaoImpl implements ExemplaireDao{
	
	@Inject
	private BibliothequeDao bibliothequeDao;
	
	@Inject
	private EditionDao editionDao;
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(ExemplaireDaoImpl.class);
	
	@Override
	public List<Exemplaire> getListExemplaire(int editionId) throws NotFoundException{
		LOGGER.info("Web Service : EditionService - Couche Consumer - Méthode getListExemplaire()");
		String vSQL = "SELECT * FROM public.exemplaire where edition_id ="+editionId+" ORDER by bibliotheque_id";
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource()); 
		
		RowMapper<Exemplaire> vRowMapper=new ExemplaireRM(bibliothequeDao,editionDao);
		List<Exemplaire> vListExemplaire=vJdbcTemplate.query(vSQL, vRowMapper);

		if(vListExemplaire.size()!=0){
			return vListExemplaire;
		}
		else
			throw new NotFoundException("Aucun exemplaire trouvé.");
	}
	
	@Override
	public Exemplaire getExemplaire(int bibliothequeId, int editionId) throws NotFoundException{
		LOGGER.info("Web Service : EditionService - Couche Consumer - Méthode getExemplaire()");
		String vSQL = "SELECT * FROM public.exemplaire where bibliotheque_id ="+bibliothequeId+" AND edition_id ="+editionId;
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource()); 
		
		RowMapper<Exemplaire> vRowMapper=new ExemplaireRM(bibliothequeDao,editionDao);
		List<Exemplaire> vListExemplaire=vJdbcTemplate.query(vSQL, vRowMapper);

		if(vListExemplaire.size()!=0){
			return vListExemplaire.get(0);
		}
		else
			throw new NotFoundException("Aucun exemplaire trouvé.");
		
	}
}