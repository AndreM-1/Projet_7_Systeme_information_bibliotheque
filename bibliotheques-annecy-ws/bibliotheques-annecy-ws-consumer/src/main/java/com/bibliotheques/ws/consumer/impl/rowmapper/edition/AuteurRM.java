package com.bibliotheques.ws.consumer.impl.rowmapper.edition;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bibliotheques.ws.model.bean.edition.Auteur;

public class AuteurRM implements RowMapper<Auteur>{

	@Override
	public Auteur mapRow(ResultSet pRS, int pRowNum) throws SQLException {
		Auteur vAuteur=new Auteur();
		vAuteur.setId(pRS.getInt("id"));
		vAuteur.setNom(pRS.getString("nom"));
		vAuteur.setPrenom(pRS.getString("prenom"));
		return vAuteur;
	}
}