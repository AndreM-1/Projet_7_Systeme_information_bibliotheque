package com.bibliotheques.ws.consumer.contract.dao;

import com.bibliotheques.ws.model.bean.edition.Ouvrage;

public interface OuvrageDao {

	Ouvrage getOuvrage(int ouvrageId);
}