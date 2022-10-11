package entites;

// TP1

public class TestAdressePostaleInst {

	public static void main(String[] args) {
		
		AdressePostaleConst adr1 = new AdressePostaleConst(5, "des Maréchaux",44100,"Nantes");
		AdressePostaleConst adr2 = new AdressePostaleConst(15, "Allée des papillons",84100,"Orange");

		System.out.println(adr1.ville);
		System.out.println(adr2.ville);
	}

}
