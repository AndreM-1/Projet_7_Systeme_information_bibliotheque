package com.bibliotheques.appliweb.model.bean.photo;

/**
 * Classe du modèle lié au bean Photo.
 * @author André Monnier
 */
public class Photo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7138510482463020046L;
	
	// ==================== Attributs ====================
	private Integer id;
	
	private String nomPhoto;
	
	// ==================== Constructeurs ====================
	/**
	 * Constructeur.
	 */
	public Photo() {
	}


	/**
	 * Constructeur.
	 *
	 * @param pId -
	 */
	public Photo(Integer pId) {
		id = pId;
	}

	// ==================== Getters/Setters ====================
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNomPhoto() {
		return nomPhoto;
	}


	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}
	
	// ==================== Méthodes ====================
	@Override
	public String toString() {
		final StringBuilder vStB = new StringBuilder(this.getClass().getSimpleName());
		final String vSeparateur = ", ";
		vStB.append(" {")
		.append("id=").append(id)
		.append(vSeparateur).append("nomPhoto=\"").append(nomPhoto).append('"')
		.append("}");
		return vStB.toString();
	}
}