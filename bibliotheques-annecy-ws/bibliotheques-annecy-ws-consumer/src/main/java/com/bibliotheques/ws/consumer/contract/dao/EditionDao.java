package com.bibliotheques.ws.consumer.contract.dao;

import java.util.List;

import com.bibliotheques.ws.model.bean.edition.Edition;

public interface EditionDao {

	List<Edition> getListEdition(int nbEdition);
}