package com.bibliotheques.appliweb.business.contract;

import com.bibliotheques.appliweb.business.contract.manager.EditionManager;
import com.bibliotheques.appliweb.business.contract.manager.UtilisateurManager;

public interface ManagerFactory {

	void setEditionManager(EditionManager editionManager);

	EditionManager getEditionManager();

	void setUtilisateurManager(UtilisateurManager utilisateurManager);

	UtilisateurManager getUtilisateurManager();
}