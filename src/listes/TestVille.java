package listes;

import java.util.ArrayList;

public class TestVille {

	public static void main(String[] args) {

		ArrayList<Ville> liste = new ArrayList<>();
		liste.add(new Ville("Nice", 343000));
		liste.add(new Ville("Carcassonne", 47800));
		liste.add(new Ville("Narbonne", 53400));
		liste.add(new Ville("Lyon", 484000));
		liste.add(new Ville("Foix", 9700));
		liste.add(new Ville("Pau", 77200));
		liste.add(new Ville("Marseille", 850700));
		liste.add(new Ville("Tarbes", 40600));

		// affichage en plusieurs lignes
		for (int i = 0; i < liste.size(); i++) {
			Ville a = liste.get(i);
			System.out.println(a);
		}
		// affichage en une seule ligne
		// System.out.println(liste);

		// Ville ayant le plus d'habitant
		Ville maxHabitants = new Ville(liste.get(0).getNom(), liste.get(0).getNbHabitants());

		for (int i = 1; i < liste.size(); i++) {
			if (maxHabitants.getNbHabitants() < liste.get(i).getNbHabitants()) {
				maxHabitants.setNbHabitants(liste.get(i).getNbHabitants());
				maxHabitants.setNom(liste.get(i).getNom());
			}
		}
		System.out.println("--------------------");
		System.out.println("Ville la plus peuplée : " + maxHabitants.getNom());

		// Suppression de la ville ayant le moins d'habitant
		Ville minHabitants = new Ville(liste.get(0).getNom(), liste.get(0).getNbHabitants());
		int index = 0;
		for (int i = 0; i < liste.size(); i++) {
			if (minHabitants.getNbHabitants() > liste.get(i).getNbHabitants()) {
				minHabitants.setNbHabitants(liste.get(i).getNbHabitants());
				minHabitants.setNom(liste.get(i).getNom());
				index = i;
			}
		}
		System.out.println("--------------------");
		System.out.println("Taille de la liste avant suppression : " + liste.size());
		System.out.println("--------------------");
		System.out.println("Ville la moins peuplée : " + minHabitants.getNom());
		liste.remove(index);
		System.out.println("Taille de la liste après suppression : " + liste.size());

		// Villes de plus de 100 000 habitants en Majuscules
		for (int i = 0; i < liste.size(); i++) {
			if (100000 < liste.get(i).getNbHabitants()) {
				liste.get(i).setNom(liste.get(i).getNom().toUpperCase());
			}
		}

		// Affichage de la liste en plusieurs lignes
		System.out.println("--------------------");
		for (int i = 0; i < liste.size(); i++) {
			Ville a = liste.get(i);
			System.out.println(a);
		}
	}

}
