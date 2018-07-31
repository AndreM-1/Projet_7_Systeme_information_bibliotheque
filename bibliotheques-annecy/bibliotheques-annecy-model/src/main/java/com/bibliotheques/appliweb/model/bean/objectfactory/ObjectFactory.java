
package com.bibliotheques.appliweb.model.bean.objectfactory;

import javax.xml.bind.annotation.XmlRegistry;

import com.bibliotheques.appliweb.model.bean.edition.Edition;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.beans package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.beans
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Edition }
     * 
     */
    public Edition createEdition() {
        return new Edition();
    }

}
