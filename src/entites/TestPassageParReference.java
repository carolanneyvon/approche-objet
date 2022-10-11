package entites;

public class TestPassageParReference {

	public static void main(String[] args) {
		
		// varibale locale (ds une méthode): pas de valeur par défaut
		// int valeur;

		Compteur cpt1 = new Compteur();
		cpt1.inc();
		cpt1.inc();
		
		System.out.println(cpt1.getValeur());
		
		
		// autre exemple
		AdressePostaleInst2 adr1 = new AdressePostaleInst2(5, "des Maréchaux",44100,"Nantes");
		AdressePostaleInst2 adr2 = new AdressePostaleInst2(15, "Allée des papillons",84100,"Orange");

		AdressePostaleInst2 adr3 = adr2; // ne créé pas de copie
		
		adr3.setVille("Pérols");
		
		System.out.println(adr1.getVille());
		System.out.println(adr2.getVille());
		System.out.println(adr3.getVille());
	}

}
