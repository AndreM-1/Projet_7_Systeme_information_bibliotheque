
package com.bibliotheques.ws.webapp.services.generated.edition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bibliotheques.ws.webapp.services.generated.edition package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetListEdition_QNAME = new QName("http://edition.contract.services.webapp.ws.bibliotheques.com/", "getListEdition");
    private final static QName _GetListEditionResponse_QNAME = new QName("http://edition.contract.services.webapp.ws.bibliotheques.com/", "getListEditionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bibliotheques.ws.webapp.services.generated.edition
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListEditionResponse }
     * 
     */
    public GetListEditionResponse createGetListEditionResponse() {
        return new GetListEditionResponse();
    }

    /**
     * Create an instance of {@link GetListEdition }
     * 
     */
    public GetListEdition createGetListEdition() {
        return new GetListEdition();
    }

    /**
     * Create an instance of {@link Edition }
     * 
     */
    public Edition createEdition() {
        return new Edition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListEdition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://edition.contract.services.webapp.ws.bibliotheques.com/", name = "getListEdition")
    public JAXBElement<GetListEdition> createGetListEdition(GetListEdition value) {
        return new JAXBElement<GetListEdition>(_GetListEdition_QNAME, GetListEdition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListEditionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://edition.contract.services.webapp.ws.bibliotheques.com/", name = "getListEditionResponse")
    public JAXBElement<GetListEditionResponse> createGetListEditionResponse(GetListEditionResponse value) {
        return new JAXBElement<GetListEditionResponse>(_GetListEditionResponse_QNAME, GetListEditionResponse.class, null, value);
    }

}
