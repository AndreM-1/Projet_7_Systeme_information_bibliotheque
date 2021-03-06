
package com.bibliotheques.appliweb.model.exception;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-08-10T10:06:10.526+02:00
 * Generated source version: 3.2.5
 */

@WebFault(name = "getListExemplaireFault", targetNamespace = "http://www.example.org/EditionService/")
public class GetListExemplaireFault_Exception extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6350940800495522544L;
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
