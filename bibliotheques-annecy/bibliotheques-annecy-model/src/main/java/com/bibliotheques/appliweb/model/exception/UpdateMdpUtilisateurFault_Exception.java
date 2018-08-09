
package com.bibliotheques.appliweb.model.exception;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-08-07T16:29:58.918+02:00
 * Generated source version: 3.2.5
 */

@WebFault(name = "updateMdpUtilisateurFault", targetNamespace = "http://www.example.org/UtilisateurService/")
public class UpdateMdpUtilisateurFault_Exception extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 463256982670182680L;
	private UpdateMdpUtilisateurFault updateMdpUtilisateurFault;

    public UpdateMdpUtilisateurFault_Exception() {
        super();
    }

    public UpdateMdpUtilisateurFault_Exception(String message) {
        super(message);
    }

    public UpdateMdpUtilisateurFault_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public UpdateMdpUtilisateurFault_Exception(String message, UpdateMdpUtilisateurFault updateMdpUtilisateurFault) {
        super(message);
        this.updateMdpUtilisateurFault = updateMdpUtilisateurFault;
    }

    public UpdateMdpUtilisateurFault_Exception(String message, UpdateMdpUtilisateurFault updateMdpUtilisateurFault, java.lang.Throwable cause) {
        super(message, cause);
        this.updateMdpUtilisateurFault = updateMdpUtilisateurFault;
    }

    public UpdateMdpUtilisateurFault getFaultInfo() {
        return this.updateMdpUtilisateurFault;
    }
}