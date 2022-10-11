package entites;

import entites2.PersonneInst;

// TP1

public class TestPersonneInst {

	public static void main(String[] args) {

		PersonneInst pers1 = new PersonneInst("Dupont", "Jean");
		PersonneInst pers2 = new PersonneInst("Hello", "World",
				new AdressePostaleInst(5, "des Maréchaux", 44100, "Nantes"));
		// pers2.adresse = new AdressePostaleConst(5, "des Maréchaux",44100,"Nantes");

		// Plus lisible
		AdressePostaleInst adr3 = new AdressePostaleInst(15, "Allée des papillons", 84100, "Orange");
		PersonneInst pers3 = new PersonneInst("Test", "Encore", adr3);
		
		
		AdressePostaleInst adr4 = new AdressePostaleInst(15, "Allée des roses", 34670, "Baillargues");
		// AdressePostaleInst adr5 = new AdressePostaleInst(15, "Gogo", 34670, "Lune");
		
		PersonneInst pers4 = new PersonneInst("Tata", "Yoyo");
		pers4.setAdresse(adr4);
		
		pers3.afficherIdentite();
		// String identite = pers3.afficherIdentite();
		// System.out.println(identite);

		pers1.setNom("Yves"); // pers1.nom = YVES
		pers1.afficherIdentite();
		
		pers2.setPrenom("Paul");
		pers2.afficherIdentite();
		
		pers3.setAdresse(adr4);
		adr3.setVille("Pérols");
		// System.out.println(pers3.adresse.ville); // si attribut class PersonneInst public
		System.out.println(pers3.getAdresse().ville); // en private
		
		AdressePostaleInst adr5 = pers3.getAdresse();
		System.out.println(adr5.codePostal);
		
		String nom = pers1.getNom();
		System.out.println(nom);
		
	}

}
