
package com.bibliotheques.ws.webapp.services.generated.edition;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "edition", targetNamespace = "http://edition.impl.services.webapp.ws.bibliotheques.com/", wsdlLocation = "http://localhost:8080/bibliotheques-annecy-ws-webapp/ws/edition?wsdl")
public class Edition_Service
    extends Service
{

    private final static URL EDITION_WSDL_LOCATION;
    private final static WebServiceException EDITION_EXCEPTION;
    private final static QName EDITION_QNAME = new QName("http://edition.impl.services.webapp.ws.bibliotheques.com/", "edition");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/bibliotheques-annecy-ws-webapp/ws/edition?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EDITION_WSDL_LOCATION = url;
        EDITION_EXCEPTION = e;
    }

    public Edition_Service() {
        super(__getWsdlLocation(), EDITION_QNAME);
    }

    public Edition_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EDITION_QNAME, features);
    }

    public Edition_Service(URL wsdlLocation) {
        super(wsdlLocation, EDITION_QNAME);
    }

    public Edition_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EDITION_QNAME, features);
    }

    public Edition_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Edition_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EditionService
     */
    @WebEndpoint(name = "EditionServiceImplPort")
    public EditionService getEditionServiceImplPort() {
        return super.getPort(new QName("http://edition.impl.services.webapp.ws.bibliotheques.com/", "EditionServiceImplPort"), EditionService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EditionService
     */
    @WebEndpoint(name = "EditionServiceImplPort")
    public EditionService getEditionServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://edition.impl.services.webapp.ws.bibliotheques.com/", "EditionServiceImplPort"), EditionService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EDITION_EXCEPTION!= null) {
            throw EDITION_EXCEPTION;
        }
        return EDITION_WSDL_LOCATION;
    }

}
