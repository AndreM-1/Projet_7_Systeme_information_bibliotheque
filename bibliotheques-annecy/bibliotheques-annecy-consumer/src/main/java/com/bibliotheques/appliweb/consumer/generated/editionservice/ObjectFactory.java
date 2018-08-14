
package com.bibliotheques.appliweb.consumer.generated.editionservice;

import javax.xml.bind.annotation.XmlRegistry;

import com.bibliotheques.appliweb.model.exception.GetListExemplaireFault;
import com.bibliotheques.appliweb.model.exception.RechercheAvanceeEditionFault;
import com.bibliotheques.appliweb.model.exception.RechercheEditionFault;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.editionservice package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.editionservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListEdition }
     * 
     */
    public GetListEdition createGetListEdition() {
        return new GetListEdition();
    }

    /**
     * Create an instance of {@link GetListEditionResponse }
     * 
     */
    public GetListEditionResponse createGetListEditionResponse() {
        return new GetListEditionResponse();
    }

    /**
     * Create an instance of {@link GetListExemplaire }
     * 
     */
    public GetListExemplaire createGetListExemplaire() {
        return new GetListExemplaire();
    }

    /**
     * Create an instance of {@link GetListExemplaireResponse }
     * 
     */
    public GetListExemplaireResponse createGetListExemplaireResponse() {
        return new GetListExemplaireResponse();
    }

    /**
     * Create an instance of {@link GetListExemplaireFault }
     * 
     */
    public GetListExemplaireFault createGetListExemplaireFault() {
        return new GetListExemplaireFault();
    }

    /**
     * Create an instance of {@link RechercheEdition }
     * 
     */
    public RechercheEdition createRechercheEdition() {
        return new RechercheEdition();
    }

    /**
     * Create an instance of {@link RechercheEditionResponse }
     * 
     */
    public RechercheEditionResponse createRechercheEditionResponse() {
        return new RechercheEditionResponse();
    }

    /**
     * Create an instance of {@link RechercheAvanceeEdition }
     * 
     */
    public RechercheAvanceeEdition createRechercheAvanceeEdition() {
        return new RechercheAvanceeEdition();
    }

    /**
     * Create an instance of {@link RechercheAvanceeEditionResponse }
     * 
     */
    public RechercheAvanceeEditionResponse createRechercheAvanceeEditionResponse() {
        return new RechercheAvanceeEditionResponse();
    }

    /**
     * Create an instance of {@link RechercheEditionFault }
     * 
     */
    public RechercheEditionFault createRechercheEditionFault() {
        return new RechercheEditionFault();
    }

    /**
     * Create an instance of {@link RechercheAvanceeEditionFault }
     * 
     */
    public RechercheAvanceeEditionFault createRechercheAvanceeEditionFault() {
        return new RechercheAvanceeEditionFault();
    }

}
