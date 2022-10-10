package entites;

public class TestEmprunt {

	public static void main(String[] args) {
		Emprunt emp1 = new Emprunt(); // sans paramètre
		Emprunt emp2 = new Emprunt(2022);
		
		System.out.println(emp1.annee);
		System.out.println(emp2.annee);

	}

}
