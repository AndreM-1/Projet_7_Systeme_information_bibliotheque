package com.bibliotheques.appliweb.business.contract;

import com.bibliotheques.appliweb.business.contract.manager.EditionManager;

public interface ManagerFactory {

	void setEditionManager(EditionManager editionManager);

	EditionManager getEditionManager();
}