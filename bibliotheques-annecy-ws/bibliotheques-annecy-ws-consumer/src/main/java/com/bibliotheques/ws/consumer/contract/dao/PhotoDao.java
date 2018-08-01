package com.bibliotheques.ws.consumer.contract.dao;

import com.bibliotheques.ws.model.bean.edition.Photo;

public interface PhotoDao {

	Photo getPhoto(int photoId);

}