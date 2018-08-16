package com.bibliotheques.ws.consumer.impl.dao;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bibliotheques.ws.consumer.contract.dao.EmpruntDao;
import com.bibliotheques.ws.consumer.contract.dao.ExemplaireDao;
import com.bibliotheques.ws.consumer.contract.dao.StatutEmpruntDao;
import com.bibliotheques.ws.consumer.contract.dao.UtilisateurDao;
import com.bibliotheques.ws.consumer.impl.rowmapper.edition.EmpruntRM;
import com.bibliotheques.ws.model.bean.edition.Emprunt;
import com.bibliotheques.ws.model.exception.NotFoundException;

@Named
public class EmpruntDaoImpl extends AbstractDaoImpl implements EmpruntDao {
	
	@Inject
	private UtilisateurDao utilisateurDao;
	
	@Inject
	private StatutEmpruntDao statutEmpruntDao;
	
	@Inject
	private ExemplaireDao exemplaireDao;
	
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(EmpruntDaoImpl.class);
	
	@Override
	public List<Emprunt> getListEmprunt(int utilisateurId) throws NotFoundException{
		LOGGER.info("Web Service : EditionService - Couche Consumer - Méthode getListEmprunt()");
		String vSQL = "SELECT * FROM public.emprunt where utilisateur_id ="+utilisateurId+" ORDER by statut_emprunt_id";
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource()); 
		
		RowMapper<Emprunt> vRowMapper=new EmpruntRM(utilisateurDao,statutEmpruntDao,exemplaireDao);
		List<Emprunt> vListEmprunt=vJdbcTemplate.query(vSQL, vRowMapper);

		if(vListEmprunt.size()!=0){
			return vListEmprunt;
		}
		else
			throw new NotFoundException("Aucun emprunt effectué pour le moment.");
	}
}