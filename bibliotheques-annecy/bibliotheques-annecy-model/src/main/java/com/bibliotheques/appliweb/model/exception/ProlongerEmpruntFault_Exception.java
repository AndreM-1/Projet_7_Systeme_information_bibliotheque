
package com.bibliotheques.appliweb.model.exception;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-08-21T11:54:24.174+02:00
 * Generated source version: 3.2.5
 */

@WebFault(name = "prolongerEmpruntFault", targetNamespace = "http://www.example.org/EditionService/")
public class ProlongerEmpruntFault_Exception extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7073645506308688734L;
	private ProlongerEmpruntFault prolongerEmpruntFault;

    public ProlongerEmpruntFault_Exception() {
        super();
    }

    public ProlongerEmpruntFault_Exception(String message) {
        super(message);
    }

    public ProlongerEmpruntFault_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ProlongerEmpruntFault_Exception(String message, ProlongerEmpruntFault prolongerEmpruntFault) {
        super(message);
        this.prolongerEmpruntFault = prolongerEmpruntFault;
    }

    public ProlongerEmpruntFault_Exception(String message, ProlongerEmpruntFault prolongerEmpruntFault, java.lang.Throwable cause) {
        super(message, cause);
        this.prolongerEmpruntFault = prolongerEmpruntFault;
    }

    public ProlongerEmpruntFault getFaultInfo() {
        return this.prolongerEmpruntFault;
    }
}
