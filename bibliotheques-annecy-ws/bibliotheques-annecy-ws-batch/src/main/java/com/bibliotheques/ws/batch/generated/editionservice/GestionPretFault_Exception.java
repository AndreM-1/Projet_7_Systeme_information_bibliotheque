
package com.bibliotheques.ws.batch.generated.editionservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-08-24T11:13:09.663+02:00
 * Generated source version: 3.2.5
 */

@WebFault(name = "gestionPretFault", targetNamespace = "http://www.example.org/EditionService/")
public class GestionPretFault_Exception extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = -658737305983653412L;
	private GestionPretFault gestionPretFault;

    public GestionPretFault_Exception() {
        super();
    }

    public GestionPretFault_Exception(String message) {
        super(message);
    }

    public GestionPretFault_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GestionPretFault_Exception(String message, GestionPretFault gestionPretFault) {
        super(message);
        this.gestionPretFault = gestionPretFault;
    }

    public GestionPretFault_Exception(String message, GestionPretFault gestionPretFault, java.lang.Throwable cause) {
        super(message, cause);
        this.gestionPretFault = gestionPretFault;
    }

    public GestionPretFault getFaultInfo() {
        return this.gestionPretFault;
    }
}
