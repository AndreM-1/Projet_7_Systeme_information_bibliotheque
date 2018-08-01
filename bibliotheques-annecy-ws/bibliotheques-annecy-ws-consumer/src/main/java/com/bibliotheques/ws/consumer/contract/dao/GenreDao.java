package com.bibliotheques.ws.consumer.contract.dao;

import com.bibliotheques.ws.model.bean.edition.Genre;

public interface GenreDao {

	Genre getGenre(int genreId);

}