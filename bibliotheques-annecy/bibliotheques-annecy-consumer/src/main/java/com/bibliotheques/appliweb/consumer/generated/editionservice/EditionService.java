package com.bibliotheques.appliweb.consumer.generated.editionservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.bibliotheques.appliweb.model.bean.edition.Edition;
import com.bibliotheques.appliweb.model.bean.edition.Emprunt;
import com.bibliotheques.appliweb.model.bean.edition.Exemplaire;
import com.bibliotheques.appliweb.model.exception.GestionPretFault_Exception;
import com.bibliotheques.appliweb.model.exception.GetListExemplaireFault_Exception;
import com.bibliotheques.appliweb.model.exception.RechercheAvanceeEditionFault_Exception;
import com.bibliotheques.appliweb.model.exception.RechercheEditionFault_Exception;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-08-16T09:43:22.381+02:00
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

    @WebMethod
    @RequestWrapper(localName = "rechercheEdition", targetNamespace = "http://www.example.org/EditionService/", className = "org.example.editionservice.RechercheEdition")
    @ResponseWrapper(localName = "rechercheEditionResponse", targetNamespace = "http://www.example.org/EditionService/", className = "org.example.editionservice.RechercheEditionResponse")
    @WebResult(name = "edition", targetNamespace = "")
    public java.util.List<Edition> rechercheEdition(
        @WebParam(name = "titre", targetNamespace = "")
        java.lang.String titre
    ) throws RechercheEditionFault_Exception;

    @WebMethod
    @RequestWrapper(localName = "getListExemplaire", targetNamespace = "http://www.example.org/EditionService/", className = "org.example.editionservice.GetListExemplaire")
    @ResponseWrapper(localName = "getListExemplaireResponse", targetNamespace = "http://www.example.org/EditionService/", className = "org.example.editionservice.GetListExemplaireResponse")
    @WebResult(name = "exemplaire", targetNamespace = "")
    public java.util.List<Exemplaire> getListExemplaire(
        @WebParam(name = "editionId", targetNamespace = "")
        int editionId
    ) throws GetListExemplaireFault_Exception;

    @WebMethod
    @RequestWrapper(localName = "rechercheAvanceeEdition", targetNamespace = "http://www.example.org/EditionService/", className = "org.example.editionservice.RechercheAvanceeEdition")
    @ResponseWrapper(localName = "rechercheAvanceeEditionResponse", targetNamespace = "http://www.example.org/EditionService/", className = "org.example.editionservice.RechercheAvanceeEditionResponse")
    @WebResult(name = "edition", targetNamespace = "")
    public java.util.List<Edition> rechercheAvanceeEdition(
        @WebParam(name = "titre", targetNamespace = "")
        java.lang.String titre,
        @WebParam(name = "nomAuteur", targetNamespace = "")
        java.lang.String nomAuteur,
        @WebParam(name = "nomEditeur", targetNamespace = "")
        java.lang.String nomEditeur,
        @WebParam(name = "anneeParution", targetNamespace = "")
        java.lang.String anneeParution,
        @WebParam(name = "genre", targetNamespace = "")
        java.lang.String genre
    ) throws RechercheAvanceeEditionFault_Exception;

    @WebMethod
    @RequestWrapper(localName = "gestionPret", targetNamespace = "http://www.example.org/EditionService/", className = "org.example.editionservice.GestionPret")
    @ResponseWrapper(localName = "gestionPretResponse", targetNamespace = "http://www.example.org/EditionService/", className = "org.example.editionservice.GestionPretResponse")
    @WebResult(name = "emprunt", targetNamespace = "")
    public java.util.List<Emprunt> gestionPret(
        @WebParam(name = "utilisateurId", targetNamespace = "")
        int utilisateurId
    ) throws GestionPretFault_Exception;
}
