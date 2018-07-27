package com.bibliotheques.appliweb.model.bean.edition;

/**
 * Classe du modèle lié au bean Ouvrage.
 * @author André Monnier
 */
public class Ouvrage implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6656259800464386715L;
	
	// ==================== Attributs ====================
	private Integer id;
	
	private String titre;
	
	private String resume;
	
	// ==================== Constructeurs ====================
	/**
	 * Constructeur.
	 */
	public Ouvrage() {
	}


	/**
	 * Constructeur.
	 *
	 * @param pId -
	 */
	public Ouvrage(Integer pId) {
		id = pId;
	}

	// ==================== Getters/Setters ====================
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getResume() {
		return resume;
	}


	public void setResume(String resume) {
		this.resume = resume;
	}
	
	// ==================== Méthodes ====================
	@Override
	public String toString() {
		final StringBuilder vStB = new StringBuilder(this.getClass().getSimpleName());
		final String vSeparateur = ", ";
		vStB.append(" {")
		.append("id=").append(id)
		.append(vSeparateur).append("titre=\"").append(titre).append('"')
		.append(vSeparateur).append("resume=\"").append(resume).append('"')
		.append("}");
		return vStB.toString();
	}
}