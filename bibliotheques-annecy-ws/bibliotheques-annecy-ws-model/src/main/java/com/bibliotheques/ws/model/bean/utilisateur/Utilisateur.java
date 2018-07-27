package com.bibliotheques.ws.model.bean.utilisateur;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


/**
* Classe du modèle lié au bean Utilisateur.
* @author André Monnier
*/
public class Utilisateur implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -293419294226839620L;
	
	// ==================== Attributs ====================
	private Integer id;
	
	@NotEmpty (message="Model - L'attribut civilite doit être renseigné")
	@NotBlank(message="Model - L'attribut civilite doit être renseigné")
	@Size (min=1,max=8,message="Model - L'attribut civilite ne doit pas comporter plus de 8 caractères")
	private String civilite;
	
	@NotEmpty (message="Model - L'attribut nom doit être renseigné")
	@NotBlank(message="Model - L'attribut nom doit être renseigné")
	@Size (min=1,max=100,message="Model - L'attribut nom ne doit pas comporter plus de 100 caractères")
	private String nom;
	
	@NotEmpty (message="Model - L'attribut prenom doit être renseigné")
	@NotBlank(message="Model - L'attribut prenom doit être renseigné")
	@Size (min=1,max=100,message="Model - L'attribut prenom ne doit pas comporter plus de 100 caractères")
	private String prenom;
	
	@NotEmpty (message="Model - L'attribut pseudo doit être renseigné")
	@NotBlank(message="Model - L'attribut pseudo doit être renseigné")
	@Size (min=1,max=100,message="Model - L'attribut pseudo ne doit pas comporter plus de 100 caractères")
	private String pseudo;
	
	@NotEmpty (message="Model - L'attribut adresseMail doit être renseigné")
	@NotBlank(message="Model - L'attribut adresseMail doit être renseigné")
	@Email   (message="Model - Le format d'adresse mail n'est pas valide")
	@Size (min=1,max=100,message="Model - L'attribut adresseMail ne doit pas comporter plus de 100 caractères")
	private String adresseMail;
	
	@NotEmpty (message="Model - L'attribut motDePasse doit être renseigné")
	@NotBlank(message="Model - L'attribut motDePasse doit être renseigné")
	@Size (min=1,max=100,message="Model - L'attribut motDePasse ne doit pas comporter plus de 100 caractères")
	private String motDePasse;
	
	private String salt;
	
	private String motDePasseSecurise;
	
	@Size(min=0, max=14, message="Model - L'attribut téléphone doit comporter 14 caractères")
	private String telephone;
	
	private Date dateNaissance;
	
	@Size (min=0,max=100,message="Model - L'attribut adresse ne doit pas comporter plus de 100 caractères")
	private String adresse;
	
	@Size (min=0,max=5,message="Model - L'attribut codePostal ne doit pas comporter plus de 5 caractères")
	private String codePostal;
	
	@Size (min=0,max=100,message="Model - L'attribut ville ne doit pas comporter plus de 100 caractères")
	private String ville;
	
	@Size (min=0,max=6,message="Model - L'attribut pays ne doit pas comporter plus de 6 caractères")
	private String pays;
	

	// ==================== Constructeurs ====================
	/**
	 * Constructeur.
	 */
	public Utilisateur() {
	}


	/**
	 * Constructeur.
	 *
	 * @param pId -
	 */
	public Utilisateur(Integer pId) {
		id = pId;
	}

	// ==================== Getters/Setters ====================
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCivilite() {
		return civilite;
	}


	public void setCivilite(String civilite) {
		this.civilite = civilite;
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


	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public String getAdresseMail() {
		return adresseMail;
	}


	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}


	public String getMotDePasse() {
		return motDePasse;
	}


	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}


	public String getSalt() {
		return salt;
	}


	public void setSalt(String salt) {
		this.salt = salt;
	}


	public String getMotDePasseSecurise() {
		return motDePasseSecurise;
	}


	public void setMotDePasseSecurise(String motDePasseSecurise) {
		this.motDePasseSecurise = motDePasseSecurise;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public Date getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
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
		.append(vSeparateur).append("civilite=\"").append(civilite).append('"')
		.append(vSeparateur).append("nom=\"").append(nom).append('"')
		.append(vSeparateur).append("prenom=\"").append(prenom).append('"')
		.append(vSeparateur).append("pseudo=\"").append(pseudo).append('"')
		.append(vSeparateur).append("adresseMail=\"").append(adresseMail).append('"')
		.append(vSeparateur).append("motDePasse=\"").append(motDePasse).append('"')
		.append(vSeparateur).append("salt=\"").append(salt).append('"')
		.append(vSeparateur).append("motDePasseSecurise=\"").append(motDePasseSecurise).append('"')
		.append(vSeparateur).append("telephone=\"").append(telephone).append('"')
		.append(vSeparateur).append("dateNaissance=\"").append(dateNaissance).append('"')
		.append(vSeparateur).append("adresse=\"").append(adresse).append('"')
		.append(vSeparateur).append("codePostal=\"").append(codePostal).append('"')
		.append(vSeparateur).append("ville=\"").append(ville).append('"')
		.append(vSeparateur).append("pays=\"").append(pays).append('"')
		.append("}");
		return vStB.toString();
	}
}