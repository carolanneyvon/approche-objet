package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		Saison[] saisons = Saison.values();

		for (Saison saison : saisons) {
			System.out.println(saison);
		}

		String nom = "ETE";
		Saison saison = Saison.valueOf(nom);
		System.out.println("Libellé de l'instance ETE : " + saison.getLibelle());

		String libelle = "Hiver";
		Saison instanceTest = Saison.getSaison(libelle);
		System.out.println("Saison du libellé : " + instanceTest.getLibelle());
	}

}
