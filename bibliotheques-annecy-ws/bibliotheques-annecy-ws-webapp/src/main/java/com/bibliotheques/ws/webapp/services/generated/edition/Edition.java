
package com.bibliotheques.ws.webapp.services.generated.edition;


import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
//import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour edition complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="edition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateParution" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nbPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edition", propOrder = {
    "dateParution",
    "format",
    "ISBN",
    "id",
    "nbPages"
})
public class Edition {

    @XmlSchemaType(name = "dateTime")
    protected Date dateParution;
    protected String format;
    @XmlElement(name = "ISBN")
    protected String ISBN;
    protected Integer id;
    protected Integer nbPages;
    
	/**
	 * Constructeur.
	 */
	public Edition() {
	}

    
	/**
	 * Constructeur avec l'ensemble des paramètres.
	 * 
	 */
	public Edition(Integer id,String ISBN,Date dateParution,Integer nbPages, String format) {
		this.id = id;
		this.ISBN=ISBN;
		this.dateParution=dateParution;
		this.nbPages=nbPages;
		this.format=format;
	}
    
        
    /**
     * Obtient la valeur de la propri�t� dateParution.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateParution() {
        return dateParution;
    }

    /**
     * D�finit la valeur de la propri�t� dateParution.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateParution(Date value) {
        this.dateParution = value;
    }

    /**
     * Obtient la valeur de la propri�t� format.
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
     * D�finit la valeur de la propri�t� format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Obtient la valeur de la propri�t� ISBN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * D�finit la valeur de la propri�t� isbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.ISBN = value;
    }

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri�t� nbPages.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbPages() {
        return nbPages;
    }

    /**
     * D�finit la valeur de la propri�t� nbPages.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbPages(Integer value) {
        this.nbPages = value;
    }
    
	// ==================== Méthodes ====================
	@Override
	public String toString() {
		final StringBuilder vStB = new StringBuilder(this.getClass().getSimpleName());
		final String vSeparateur = ", ";
		vStB.append(" {")
		.append("id=").append(id)
		.append(vSeparateur).append("ISBN=\"").append(ISBN).append('"')
		.append(vSeparateur).append("dateParution=\"").append(dateParution).append('"')
		.append(vSeparateur).append("nbPages=\"").append(nbPages).append('"')
		.append(vSeparateur).append("format=\"").append(format).append('"')
		.append("}");
		return vStB.toString();
	}
}