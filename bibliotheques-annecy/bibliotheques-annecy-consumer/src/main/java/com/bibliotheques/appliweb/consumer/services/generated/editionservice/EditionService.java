package com.bibliotheques.appliweb.consumer.services.generated.editionservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.bibliotheques.appliweb.model.bean.edition.Edition;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-07-30T22:28:37.980+02:00
 * Generated source version: 3.2.5
 *
 */
@WebService(targetNamespace = "http://www.example.org/EditionService/", name = "EditionService")
@XmlSeeAlso({ObjectFactory.class, com.bibliotheques.appliweb.model.bean.objectfactory.ObjectFactory.class})
public interface EditionService {

    @WebMethod
    @RequestWrapper(localName = "getListEdition", targetNamespace = "http://www.example.org/EditionService/", className = "org.example.editionservice.GetListEdition")
    @ResponseWrapper(localName = "getListEditionResponse", targetNamespace = "http://www.example.org/EditionService/", className = "org.example.editionservice.GetListEditionResponse")
    @WebResult(name = "edition", targetNamespace = "")
    public java.util.List<Edition> getListEdition(
        @WebParam(name = "nbEdition", targetNamespace = "")
        int nbEdition
    );
}
