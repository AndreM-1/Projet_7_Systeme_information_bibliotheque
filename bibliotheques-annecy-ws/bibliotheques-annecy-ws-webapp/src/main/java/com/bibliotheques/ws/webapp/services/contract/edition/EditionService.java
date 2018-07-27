package com.bibliotheques.ws.webapp.services.contract.edition;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.bibliotheques.ws.model.bean.edition.Edition;

@WebService
public interface EditionService {

	@WebMethod
	public List<Edition> getListEdition(@WebParam(name="nbEdition") Integer nbEdition);
}
