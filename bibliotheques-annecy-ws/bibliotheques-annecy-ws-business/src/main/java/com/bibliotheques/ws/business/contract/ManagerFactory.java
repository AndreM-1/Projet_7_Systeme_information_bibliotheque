package com.bibliotheques.ws.business.contract;

import com.bibliotheques.ws.business.contract.manager.EditionManager;

public interface ManagerFactory {

	void setEditionManager(EditionManager editionManager);

	EditionManager getEditionManager();
}