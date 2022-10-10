package entites;

import entites2.PersonneConst;

// TP2

public class testPersonneConst {

	public static void main(String[] args) {
		
		
		PersonneConst pers1 = new PersonneConst("Dupont", "Jean");
		PersonneConst pers2 = new PersonneConst("Hello", "World", new AdressePostaleConst(5, "des Maréchaux",44100,"Nantes"));
		// pers2.adresse = new AdressePostaleConst(5, "des Maréchaux",44100,"Nantes");

		// Plus lisible
		AdressePostaleConst adr3 = new AdressePostaleConst(15, "Allée des papillons",84100,"Orange");	
		PersonneConst pers3 = new PersonneConst("Test", "Encore", adr3);


		System.out.println(pers1.nom);
		System.out.println(pers2.prenom);
		System.out.println(pers3.adresse.ville);
	}

}
