package entites;

import entites2.Personne;

// TP1

public class testPersonne {

	public static void main(String[] args) {

		Personne pers1 = new Personne();
		pers1.nom = "Dupont";
		pers1.prenom = "Jean";
		pers1.adresse = new AdressePostale();
		pers1.adresse.numeroRue = 5;
		pers1.adresse.libelleRue = "des Maréchaux";
		pers1.adresse.codePostal = 44100;
		pers1.adresse.ville = "Nantes";

		Personne pers2 = new Personne();
		pers2.nom = "Dupont";
		pers2.prenom = "Jean";
		pers2.adresse = new AdressePostale();
		pers2.adresse.numeroRue = 5;
		pers2.adresse.libelleRue = "des Maréchaux";
		pers2.adresse.codePostal = 44100;
		pers2.adresse.ville = "Nantes";

		
		AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue = 5;
		adr1.libelleRue = "des Maréchaux";
		adr1.codePostal = 44100;
		adr1.ville = "Nantes";

		Personne pers3 = new Personne();
		pers3.nom = "test";
		pers3.prenom = "Encore";
		pers3.adresse = adr1;

		System.out.println(pers1.nom);
	}

}
