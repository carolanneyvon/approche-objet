package herite;

public class TestVehicule {

	public static void main(String[] args) {
		Avion av = new Avion("Aibus", "A320", "FR123456");
//		av.setMarque("AIRBUS");
//		av.setModele("A320");
//		av.setMatricule("FR123456");
		av.demarrer();
		
		// la méthode println invoque la méthode toString()
		System.out.println(av);
		// System.out.println(av.toString()); identique 
	
		
		
	}

}
