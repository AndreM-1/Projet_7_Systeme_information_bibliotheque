package com.bibliotheques.ws.consumer.contract;

import com.bibliotheques.ws.consumer.contract.dao.EditeurDao;
import com.bibliotheques.ws.consumer.contract.dao.EditionDao;
import com.bibliotheques.ws.consumer.contract.dao.GenreDao;
import com.bibliotheques.ws.consumer.contract.dao.OuvrageDao;
import com.bibliotheques.ws.consumer.contract.dao.PhotoDao;

public interface DaoFactory {

	void setEditionDao(EditionDao editionDao);

	EditionDao getEditionDao();

	void setPhotoDao(PhotoDao photoDao);

	PhotoDao getPhotoDao();

	void setOuvrageDao(OuvrageDao ouvrageDao);

	OuvrageDao getOuvrageDao();

	void setGenreDao(GenreDao genreDao);

	GenreDao getGenreDao();

	void setEditeurDao(EditeurDao editeurDao);

	EditeurDao getEditeurDao();
}