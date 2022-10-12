package fr.diginamic.banque.entites;

public class TestBanqueTaux {

	public static void main(String[] args) {
		// CompteRedefintion compte1 = new CompteRedefintion(123456789, 12500);

		CompteRedefintion[] comptes = new CompteRedefintion[2];
		comptes[0] = new CompteRedefintion(123456789, 12500);
		comptes[1] = new CompteTaux(123456888, 35000, 1.5);

		// CompteRedefintion[] comptes = {new CompteRedefintion(123456789, 12500), new CompteTaux(123456888, 35000, 1.5)};

		for (int i = 0; i < comptes.length; i++) {
			System.out.println(comptes[i]);
		}
	}
}
