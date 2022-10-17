package maps;

import java.util.ArrayList;
import java.util.HashMap;

import listes.Ville;

public class MapVilles2 {

// TP N°12 exercice 04
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

		// création de la Map
		HashMap<String, Ville> mapVilles2 = new HashMap<>();
		// Sans Utiliser le ArrayList
		// Ville v1 = new Ville("Nice", 343000);
		// mapVilles2.put(v1.getNom(), v1);

		// création de la Map et affichage en plusieurs lignes
		for (int i = 0; i < liste.size(); i++) {
			Ville a = liste.get(i);
			mapVilles2.put(a.getNom(), a);
			System.out.println(a);
		}
		
		// autre écriture correction
//		for (Ville v: liste) {
//			mapVilles2.put(v.getNom(), v);	
//		}

		System.out.println("--------------------");
		System.out.println("Taille de la map : "+mapVilles2.size());

		// ville ayant le plus petit nombre d'habitants
		String minVille = "";
		Integer minHabitants = Integer.MAX_VALUE;
		
		for (String cle : mapVilles2.keySet()) {
			if (mapVilles2.get(cle).getNbHabitants() < minHabitants) {
				minHabitants = mapVilles2.get(cle).getNbHabitants();
				minVille = cle;
			}
		}
		System.out.println("--------------------");
		System.out.println("Le ville ayant le plus petit nombre d'habitants : " + minVille + " (" + minHabitants + " habitants)");
		
		// suppression de la ville
		mapVilles2.remove(minVille);
		
		System.out.println("--------------------");
		for (int i = 0; i < liste.size(); i++) {
			Ville a = liste.get(i);
			System.out.println(a);
		}
		System.out.println("--------------------");
		System.out.println("Taille de la map : "+mapVilles2.size());

	}

}
