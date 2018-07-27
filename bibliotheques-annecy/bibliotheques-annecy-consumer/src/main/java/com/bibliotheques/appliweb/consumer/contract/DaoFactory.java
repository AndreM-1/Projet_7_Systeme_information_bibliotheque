package com.bibliotheques.appliweb.consumer.contract;

import com.bibliotheques.appliweb.consumer.contract.dao.EditionDao;

public interface DaoFactory {

	void setEditionDao(EditionDao editionDao);

	EditionDao getEditionDao();
}