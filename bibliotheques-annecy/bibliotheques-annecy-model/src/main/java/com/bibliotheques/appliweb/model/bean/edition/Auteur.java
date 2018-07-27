package com.bibliotheques.appliweb.model.bean.edition;

/**
 * Classe du modèle lié au bean Auteur.
 * @author André Monnier
 */
public class Auteur implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7246608447180288284L;

	// ==================== Attributs ====================
	private Integer id;

	private String nom;

	private String prenom;

	// ==================== Constructeurs ====================
	/**
	 * Constructeur.
	 */
	public Auteur() {
	}


	/**
	 * Constructeur.
	 *
	 * @param pId -
	 */
	public Auteur(Integer pId) {
		id = pId;
	}


	// ==================== Getters/Setters ====================
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	// ==================== Méthodes ====================
	@Override
	public String toString() {
		final StringBuilder vStB = new StringBuilder(this.getClass().getSimpleName());
		final String vSeparateur = ", ";
		vStB.append(" {")
		.append("id=").append(id)
		.append(vSeparateur).append("nom=\"").append(nom).append('"')
		.append(vSeparateur).append("prenom=\"").append(prenom).append('"')
		.append("}");
		return vStB.toString();
	}
}
