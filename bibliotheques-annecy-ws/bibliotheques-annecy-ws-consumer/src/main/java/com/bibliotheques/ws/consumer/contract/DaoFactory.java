package com.bibliotheques.ws.consumer.contract;

import com.bibliotheques.ws.consumer.contract.dao.EditionDao;

public interface DaoFactory {

	void setEditionDao(EditionDao editionDao);

	EditionDao getEditionDao();
}