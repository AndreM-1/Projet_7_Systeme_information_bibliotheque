package com.bibliotheques.ws.webapp.utilisateurservice.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.bibliotheques.ws.model.bean.utilisateur.Utilisateur;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-08-03T15:57:54.948+02:00
 * Generated source version: 3.2.5
 *
 */
@WebService(targetNamespace = "http://www.example.org/UtilisateurService/", name = "UtilisateurService")
@XmlSeeAlso({ObjectFactory.class, com.bibliotheques.ws.model.bean.objectfactory.ObjectFactory.class})
public interface UtilisateurService {

    @WebMethod
    @RequestWrapper(localName = "creerCompteUtilisateur", targetNamespace = "http://www.example.org/UtilisateurService/", className = "org.example.utilisateurservice.CreerCompteUtilisateur")
    @ResponseWrapper(localName = "creerCompteUtilisateurResponse", targetNamespace = "http://www.example.org/UtilisateurService/", className = "org.example.utilisateurservice.CreerCompteUtilisateurResponse")
    @WebResult(name = "utilisateur", targetNamespace = "")
    public Utilisateur creerCompteUtilisateur(
        @WebParam(name = "civilite", targetNamespace = "")
        java.lang.String civilite,
        @WebParam(name = "nom", targetNamespace = "")
        java.lang.String nom,
        @WebParam(name = "prenom", targetNamespace = "")
        java.lang.String prenom,
        @WebParam(name = "pseudo", targetNamespace = "")
        java.lang.String pseudo,
        @WebParam(name = "adresseMail", targetNamespace = "")
        java.lang.String adresseMail,
        @WebParam(name = "motDePasse", targetNamespace = "")
        java.lang.String motDePasse,
        @WebParam(name = "confirmationMotDePasse", targetNamespace = "")
        java.lang.String confirmationMotDePasse,
        @WebParam(name = "conditionsUtilisation", targetNamespace = "")
        boolean conditionsUtilisation
    ) throws CreerCompteUtilisateurFault_Exception;

    @WebMethod
    @RequestWrapper(localName = "updateMdpUtilisateur", targetNamespace = "http://www.example.org/UtilisateurService/", className = "org.example.utilisateurservice.UpdateMdpUtilisateur")
    @ResponseWrapper(localName = "updateMdpUtilisateurResponse", targetNamespace = "http://www.example.org/UtilisateurService/", className = "org.example.utilisateurservice.UpdateMdpUtilisateurResponse")
    public void updateMdpUtilisateur(
        @WebParam(name = "ancienMdp", targetNamespace = "")
        java.lang.String ancienMdp,
        @WebParam(name = "nouveauMdp", targetNamespace = "")
        java.lang.String nouveauMdp,
        @WebParam(name = "confirmationNouveauMdp", targetNamespace = "")
        java.lang.String confirmationNouveauMdp
    ) throws UpdateMdpUtilisateurFault_Exception;

    @WebMethod
    @RequestWrapper(localName = "authentifierUtilisateur", targetNamespace = "http://www.example.org/UtilisateurService/", className = "org.example.utilisateurservice.AuthentifierUtilisateur")
    @ResponseWrapper(localName = "authentifierUtilisateurResponse", targetNamespace = "http://www.example.org/UtilisateurService/", className = "org.example.utilisateurservice.AuthentifierUtilisateurResponse")
    @WebResult(name = "utilisateur", targetNamespace = "")
    public Utilisateur authentifierUtilisateur(
        @WebParam(name = "adresseMail", targetNamespace = "")
        java.lang.String adresseMail,
        @WebParam(name = "motDePasse", targetNamespace = "")
        java.lang.String motDePasse
    ) throws AuthentifierUtilisateurFault_Exception;

    @WebMethod
    @RequestWrapper(localName = "updateCoordUtilisateur", targetNamespace = "http://www.example.org/UtilisateurService/", className = "org.example.utilisateurservice.UpdateCoordUtilisateur")
    @ResponseWrapper(localName = "updateCoordUtilisateurResponse", targetNamespace = "http://www.example.org/UtilisateurService/", className = "org.example.utilisateurservice.UpdateCoordUtilisateurResponse")
    public void updateCoordUtilisateur(
        @WebParam(name = "utilisateur", targetNamespace = "")
        Utilisateur utilisateur
    ) throws UpdateCoordUtilisateurFault_Exception;
}
