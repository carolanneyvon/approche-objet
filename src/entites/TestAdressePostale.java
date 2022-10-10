package entites;

// TP1

public class TestAdressePostale {

	public static void main(String[] args) {

		AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue = 5;
		adr1.libelleRue = "des Maréchaux";
		adr1.codePostal = 44100;
		adr1.ville = "Nantes";
		
		AdressePostale adr2 = new AdressePostale();
		adr2.numeroRue = 15;
		adr2.libelleRue = "Allée des papillons";
		adr2.codePostal = 84100;
		adr2.ville = "Orange";

	}

}
