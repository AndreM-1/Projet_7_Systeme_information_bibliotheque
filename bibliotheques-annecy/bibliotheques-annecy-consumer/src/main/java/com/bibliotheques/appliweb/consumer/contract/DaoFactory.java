package com.bibliotheques.appliweb.consumer.contract;

import com.bibliotheques.appliweb.consumer.contract.dao.EditionDao;
import com.bibliotheques.appliweb.consumer.contract.dao.UtilisateurDao;

public interface DaoFactory {

	void setEditionDao(EditionDao editionDao);

	EditionDao getEditionDao();

	void setUtilisateurDao(UtilisateurDao utilisateurDao);

	UtilisateurDao getUtilisateurDao();
}