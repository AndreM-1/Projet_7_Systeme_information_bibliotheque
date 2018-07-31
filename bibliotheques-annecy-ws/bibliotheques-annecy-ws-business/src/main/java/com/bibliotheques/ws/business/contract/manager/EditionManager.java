package com.bibliotheques.ws.business.contract.manager;

import java.util.List;

import com.bibliotheques.ws.model.bean.edition.Edition;

public interface EditionManager {

	List<Edition> getListEdition(int nbEdition);
}