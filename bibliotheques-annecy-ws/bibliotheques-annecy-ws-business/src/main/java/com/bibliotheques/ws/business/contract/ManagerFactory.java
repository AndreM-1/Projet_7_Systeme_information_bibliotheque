package com.bibliotheques.ws.business.contract;

import com.bibliotheques.ws.business.contract.manager.EditionManager;
import com.bibliotheques.ws.business.contract.manager.UtilisateurManager;

public interface ManagerFactory {

	void setEditionManager(EditionManager editionManager);

	EditionManager getEditionManager();

	void setUtilisateurManager(UtilisateurManager utilisateurManager);

	UtilisateurManager getUtilisateurManager();
}