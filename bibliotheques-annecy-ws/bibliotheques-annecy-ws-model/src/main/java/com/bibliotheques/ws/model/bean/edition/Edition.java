
package com.bibliotheques.ws.model.bean.edition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Edition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Edition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateParution" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="nbPages" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Edition", propOrder = {
    "id",
    "isbn",
    "dateParution",
    "nbPages",
    "format"
})
public class Edition {

    protected int id;
    @XmlElement(name = "ISBN", required = true)
    protected String isbn;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateParution;
    protected int nbPages;
    @XmlElement(required = true)
    protected String format;

    /**
     * Construteur avec paramètres pour les tests.
     */
    public Edition(int id,String isbn, XMLGregorianCalendar dateParution,int nbPages,String format) {
    	this.id=id;
    	this.isbn=isbn;
    	this.dateParution=dateParution;
    	this.nbPages=nbPages;
    	this.format=format;
    }
    
    /**
     * Vu que l'on a défini un constructeur avec paramètres, on est obligé de définir un constructeur par défaut
     * qui est utilisé par la classe ObjectFactory.
     */
    public Edition() {
    	
    }
    
    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété isbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Définit la valeur de la propriété isbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn(String value) {
        this.isbn = value;
    }

    /**
     * Obtient la valeur de la propriété dateParution.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateParution() {
        return dateParution;
    }

    /**
     * Définit la valeur de la propriété dateParution.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateParution(XMLGregorianCalendar value) {
        this.dateParution = value;
    }

    /**
     * Obtient la valeur de la propriété nbPages.
     * 
     */
    public int getNbPages() {
        return nbPages;
    }

    /**
     * Définit la valeur de la propriété nbPages.
     * 
     */
    public void setNbPages(int value) {
        this.nbPages = value;
    }

    /**
     * Obtient la valeur de la propriété format.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Définit la valeur de la propriété format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

}
