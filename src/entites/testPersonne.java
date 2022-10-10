package entites;

import entites2.Personne;

public class testPersonne {

	public static void main(String[] args) {

		Personne pers1 = new Personne();
		pers1.nom = "Dupont";
		pers1.prenom = "Jean";
		pers1.adressePostale = new AdressePostale();
		pers1.adressePostale.numeroRue = 5;
		pers1.adressePostale.libelleRue = "des Maréchaux";
		pers1.adressePostale.codePostal = 44100;
		pers1.adressePostale.ville = "Nantes";

		Personne pers2 = new Personne();
		pers2.nom = "Dupont";
		pers2.prenom = "Jean";
		pers2.adressePostale = new AdressePostale();
		pers2.adressePostale.numeroRue = 5;
		pers2.adressePostale.libelleRue = "des Maréchaux";
		pers2.adressePostale.codePostal = 44100;
		pers2.adressePostale.ville = "Nantes";
		
//		Personne pers3 = new Personne();
//		pers3.nom = "test";
//		pers3.prenom = "Encore";
//		pers3.adressePostale = adr1; 

		System.out.println(pers1.nom);
	}

}
