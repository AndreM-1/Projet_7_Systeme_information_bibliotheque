package com.bibliotheques.ws.consumer.impl.dao;

import java.util.List;

import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.bibliotheques.ws.consumer.contract.dao.UtilisateurDao;
import com.bibliotheques.ws.consumer.impl.rowmapper.utilisateur.UtilisateurRM;
import com.bibliotheques.ws.model.bean.utilisateur.Utilisateur;
import com.bibliotheques.ws.model.exception.FunctionalException;
import com.bibliotheques.ws.model.exception.NotFoundException;

@Named
public class UtilisateurDaoImpl extends AbstractDaoImpl implements UtilisateurDao{
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(UtilisateurDaoImpl.class);

	@Override
	public Utilisateur getUtilisateur(String adresseMail) throws NotFoundException {
		LOGGER.info("Web Service : UtilisateurService - Couche Consumer - Méthode getUtilisateur");
		String vSQL="SELECT * FROM public.utilisateur WHERE adresse_mail='"+adresseMail+"'";
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource()); 
		RowMapper<Utilisateur> vRowMapper=new UtilisateurRM();
		List<Utilisateur> vListUtilisateur=vJdbcTemplate.query(vSQL, vRowMapper);

		if(vListUtilisateur.size()!=0)	{
			return vListUtilisateur.get(0);
		}
		else
			throw new NotFoundException("Web Service : UtilisateurService - Couche Consumer - Méthode getUtilisateur - Aucun utilisateur correspondant à l'adresse mail demandée.");
		
	}
	
	@Override
	public void insertUtilisateur(Utilisateur utilisateur) throws FunctionalException{

		String vSQL="INSERT INTO public.utilisateur(civilite,nom,prenom,pseudo,adresse_mail,salt,mot_de_passe_securise,pays) VALUES "
				+ "(:civilite,:nom,:prenom,:pseudo,:adresseMail,:salt,:motDePasseSecurise,:pays)";	
		SqlParameterSource vParams=new BeanPropertySqlParameterSource(utilisateur);
		NamedParameterJdbcTemplate vJdbcTemplate=new NamedParameterJdbcTemplate(getDataSource());

		try {
			vJdbcTemplate.update(vSQL,vParams);
		} catch (DuplicateKeyException vEx) {
			LOGGER.info("Le pseudo ou l'adresse mail existe déjà.");
			throw new FunctionalException("Le pseudo ou l'adresse mail existe déjà.");
		}
	}
	
}