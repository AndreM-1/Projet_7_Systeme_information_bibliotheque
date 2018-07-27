package com.bibliotheques.appliweb.model.bean.edition;

import java.util.Date;

/**
 * Classe du modèle lié au bean Edition.
 * @author André Monnier
 */
public class Edition implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8846497943609178297L;
	
	// ==================== Attributs ====================
	private Integer id;
	
	private String ISBN;
	
	private Date dateParution;
	
	private Integer nbPages;
	
	private String format;
	
	// ==================== Constructeurs ====================
	/**
	 * Constructeur.
	 */
	public Edition() {
	}


	/**
	 * Constructeur.
	 *
	 * @param pId -
	 */
	public Edition(Integer pId) {
		id = pId;
	}

	// ==================== Getters/Setters ====================
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	public Date getDateParution() {
		return dateParution;
	}


	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}


	public Integer getNbPages() {
		return nbPages;
	}


	public void setNbPages(Integer nbPages) {
		this.nbPages = nbPages;
	}


	public String getFormat() {
		return format;
	}


	public void setFormat(String format) {
		this.format = format;
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