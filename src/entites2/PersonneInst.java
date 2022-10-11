package entites2;

import entites.AdressePostaleInst;

// TP1

public class PersonneInst {

	private String nom;
	private String prenom;
	private AdressePostaleInst adresse;

	public PersonneInst(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public PersonneInst(String nom, String prenom, AdressePostaleInst adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	// méthode pour afficher le nom et le prénom avec le nom de famille en
	// majuscules
	public void afficherIdentite() {
		System.out.println(prenom + " " + nom.toUpperCase());
	}
	// avec un return
	// public String afficherIdentite() {
	// return prenom+ " " + nom.toUpperCase();
	// }

	// méthode qui prend un argument en paramètre et permet de modifier la variable
	// d’instance nom, prénom et adresse de Personne.
	public void setNom(String nvNom) {
		this.nom = nvNom;
	}

	public void setPrenom(String nvPrenom) {
		this.nom = nvPrenom;
	}

	public void setAdresse(AdressePostaleInst nvAdresse) {
		this.adresse = nvAdresse;
	}
	
	// méthode qui retourne le nom, prénom et adresse
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public AdressePostaleInst getAdresse() {
		return this.adresse;
	}

}
