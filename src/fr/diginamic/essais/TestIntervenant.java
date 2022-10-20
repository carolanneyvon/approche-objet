package fr.diginamic.essais;

import fr.diginamic.salaire.Salarie;
import fr.diginamic.salaire.Pigiste;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie salarie1 = new Salarie("Alpha", "Test", 1654);
		Pigiste pigiste1 = new Pigiste("Beta", "Autre", 15, 25.5);

		// étape 1
		System.out.println("---------- étape 1 ----------");
		System.out.println(salarie1); // avec toString
		System.out.println(salarie1.getSalaire() + " €");
		System.out.println(pigiste1); // avec toString
		System.out.println(pigiste1.getSalaire() + " €");
		
		// étape 2
		System.out.println("---------- étape 2 ----------");
		salarie1.afficherDonnees();
		pigiste1.afficherDonnees();
		
	}

}
