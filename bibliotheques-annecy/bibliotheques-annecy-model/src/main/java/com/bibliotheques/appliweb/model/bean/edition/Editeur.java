package com.bibliotheques.appliweb.model.bean.edition;

/**
 * Classe du modèle lié au bean Editeur.
 * @author André Monnier
 */
public class Editeur implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1792675534286282319L;
	
	// ==================== Attributs ====================
	private Integer id;
	
	private String nomEditeur;
	
	// ==================== Constructeurs ====================
	/**
	 * Constructeur.
	 */
	public Editeur() {
	}


	/**
	 * Constructeur.
	 *
	 * @param pId -
	 */
	public Editeur(Integer pId) {
		id = pId;
	}

	// ==================== Getters/Setters ====================
	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}


	public String getNomEditeur() {
		return nomEditeur;
	}


	public void setNomEditeur(String nomEditeur) {
		this.nomEditeur = nomEditeur;
	}
	
	// ==================== Méthodes ====================
	@Override
	public String toString() {
		final StringBuilder vStB = new StringBuilder(this.getClass().getSimpleName());
		final String vSeparateur = ", ";
		vStB.append(" {")
		.append("id=").append(id)
		.append(vSeparateur).append("nomEditeur=\"").append(nomEditeur).append('"')
		.append("}");
		return vStB.toString();
	}
}