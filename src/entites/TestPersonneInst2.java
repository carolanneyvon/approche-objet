package entites;


public class TestPersonneInst2 {

	public static void main(String[] args) {

		AdressePostaleInst2 adr3 = new AdressePostaleInst2(15, "Allée des papillons", 84100, "Orange");
		AdressePostaleInst2 adr4 = new AdressePostaleInst2(15, "Allée des roses", 34670, "Baillargues");

		//System.out.println(adr3.pays);sans la méthode static
		System.out.println(adr4.getPays());
		
		//adr3.pays = "Belgique";
		//AdressePostaleInst2.pays = "Belgique"; // écriture possible car pays static
		//System.out.println(adr3.pays);
		//System.out.println(adr4.pays);
		System.out.println(AdressePostaleInst2.getPays());
		
	}

}
