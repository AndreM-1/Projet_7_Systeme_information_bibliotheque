package com.bibliotheques.ws.model.bean.edition;

/**
 * Classe du modèle lié au bean Bibliotheque.
 * @author André Monnier
 */
public class Bibliotheque implements java.io.Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3154081966391492281L;
	
	// ==================== Attributs ====================
	private Integer id;

	private String nomBibliotheque;

	private String telephone;
	
	private String adresse;
	
	private String codePostal;
	
	private String ville;
	
	private String pays;
	
	// ==================== Constructeurs ====================
	/**
	 * Constructeur.
	 */
	public Bibliotheque() {
	}


	/**
	 * Constructeur.
	 *
	 * @param pId -
	 */
	public Bibliotheque(Integer pId) {
		id = pId;
	}

	// ==================== Getters/Setters ====================
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNomBibliotheque() {
		return nomBibliotheque;
	}


	public void setNomBibliotheque(String nomBibliotheque) {
		this.nomBibliotheque = nomBibliotheque;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}

	// ==================== Méthodes ====================
	@Override
	public String toString() {
		final StringBuilder vStB = new StringBuilder(this.getClass().getSimpleName());
		final String vSeparateur = ", ";
		vStB.append(" {")
		.append("id=").append(id)
		.append(vSeparateur).append("nomBibliotheque=\"").append(nomBibliotheque).append('"')
		.append(vSeparateur).append("telephone=\"").append(telephone).append('"')
		.append(vSeparateur).append("adresse=\"").append(adresse).append('"')
		.append(vSeparateur).append("codePostal=\"").append(codePostal).append('"')
		.append(vSeparateur).append("ville=\"").append(ville).append('"')
		.append(vSeparateur).append("pays=\"").append(pays).append('"')
		.append("}");
		return vStB.toString();
	}
}