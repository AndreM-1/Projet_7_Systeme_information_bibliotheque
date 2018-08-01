package com.bibliotheques.ws.consumer.impl.rowmapper.edition;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bibliotheques.ws.model.bean.edition.Editeur;

public class EditeurRM implements RowMapper<Editeur> {

	@Override
	public Editeur mapRow(ResultSet pRS, int pRowNum) throws SQLException {
		Editeur vEditeur=new Editeur();
		vEditeur.setId(pRS.getInt("id"));
		vEditeur.setNomEditeur(pRS.getString("nom_editeur"));
		return vEditeur;
	}
}