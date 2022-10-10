package entites2;

import entites.AdressePostaleConst;

// TP2 
public class PersonneConst {

	public String nom;
	public String prenom;
	public AdressePostaleConst adresse;
	
	public PersonneConst(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public PersonneConst(String nom, String prenom, AdressePostaleConst adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}


	
	

	
}
