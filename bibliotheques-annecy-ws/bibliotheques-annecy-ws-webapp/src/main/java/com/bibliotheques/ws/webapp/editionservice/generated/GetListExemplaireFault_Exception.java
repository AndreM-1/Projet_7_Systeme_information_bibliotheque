
package com.bibliotheques.ws.webapp.editionservice.generated;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-08-09T15:03:47.877+02:00
 * Generated source version: 3.2.5
 */

@WebFault(name = "getListExemplaireFault", targetNamespace = "http://www.example.org/EditionService/")
public class GetListExemplaireFault_Exception extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6491655045790128970L;
	private GetListExemplaireFault getListExemplaireFault;

    public GetListExemplaireFault_Exception() {
        super();
    }

    public GetListExemplaireFault_Exception(String message) {
        super(message);
    }

    public GetListExemplaireFault_Exception(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public GetListExemplaireFault_Exception(String message, GetListExemplaireFault getListExemplaireFault) {
        super(message);
        this.getListExemplaireFault = getListExemplaireFault;
    }

    public GetListExemplaireFault_Exception(String message, GetListExemplaireFault getListExemplaireFault, java.lang.Throwable cause) {
        super(message, cause);
        this.getListExemplaireFault = getListExemplaireFault;
    }

    public GetListExemplaireFault getFaultInfo() {
        return this.getListExemplaireFault;
    }
}
