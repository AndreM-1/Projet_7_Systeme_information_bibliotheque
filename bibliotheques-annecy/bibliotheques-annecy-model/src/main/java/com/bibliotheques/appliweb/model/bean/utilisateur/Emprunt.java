package com.bibliotheques.appliweb.model.bean.utilisateur;

import java.util.Date;

/**
 * Classe du modèle lié au bean Emprunt.
 * @author André Monnier
 */
public class Emprunt implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6633559410035228617L;
	
	// ==================== Attributs ====================
	private Integer id;
	
	private Date dateDeDebut;
	
	private Date dateDeFin;
	
	private Boolean prolongation;
	
	private Date dateDeProlongation;
	
	private String dureeProlongation;
	
	private Date dateDeRetourEffective;
	
	// ==================== Constructeurs ====================
	/**
	 * Constructeur.
	 */
	public Emprunt() {
	}


	/**
	 * Constructeur.
	 *
	 * @param pId -
	 */
	public Emprunt(Integer pId) {
		id = pId;
	}

	// ==================== Getters/Setters ====================
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getDateDeDebut() {
		return dateDeDebut;
	}


	public void setDateDeDebut(Date dateDeDebut) {
		this.dateDeDebut = dateDeDebut;
	}


	public Date getDateDeFin() {
		return dateDeFin;
	}


	public void setDateDeFin(Date dateDeFin) {
		this.dateDeFin = dateDeFin;
	}


	public Boolean getProlongation() {
		return prolongation;
	}


	public void setProlongation(Boolean prolongation) {
		this.prolongation = prolongation;
	}


	public Date getDateDeProlongation() {
		return dateDeProlongation;
	}


	public void setDateDeProlongation(Date dateDeProlongation) {
		this.dateDeProlongation = dateDeProlongation;
	}


	public String getDureeProlongation() {
		return dureeProlongation;
	}


	public void setDureeProlongation(String dureeProlongation) {
		this.dureeProlongation = dureeProlongation;
	}


	public Date getDateDeRetourEffective() {
		return dateDeRetourEffective;
	}


	public void setDateDeRetourEffective(Date dateDeRetourEffective) {
		this.dateDeRetourEffective = dateDeRetourEffective;
	}
	
	// ==================== Méthodes ====================
	@Override
	public String toString() {
		final StringBuilder vStB = new StringBuilder(this.getClass().getSimpleName());
		final String vSeparateur = ", ";
		vStB.append(" {")
		.append("id=").append(id)
		.append(vSeparateur).append("dateDeDebut=\"").append(dateDeDebut).append('"')
		.append(vSeparateur).append("dateDeFin=\"").append(dateDeFin).append('"')
		.append(vSeparateur).append("prolongation=\"").append(prolongation).append('"')
		.append(vSeparateur).append("dateDeProlongation=\"").append(dateDeProlongation).append('"')
		.append(vSeparateur).append("dureeProlongation=\"").append(dureeProlongation).append('"')
		.append(vSeparateur).append("dateDeRetourEffective=\"").append(dateDeRetourEffective).append('"')
		.append("}");
		return vStB.toString();
	}
}