package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapVilles {

	public static void main(String[] args) {
		// création de la Map pour les préfectures par n° de département
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		// Récupération de l'ensemble des clés
		System.out.println("Clés contenues dans la Map : ");
		Set<Integer> keys = mapVilles.keySet();
		for (Integer k : keys) {
			System.out.println(k);
		}
		System.out.println("--------------------");

		// Récupération de l'ensemble des valeurs
		System.out.println("Valeurs contenues dans la Map : ");
		Collection<String> values = mapVilles.values();
		for (String u : values) {
			System.out.println(u);
		}
		System.out.println("--------------------");
		
		// Taille de le Map
		System.out.println("Taille de la map : "+mapVilles.size());

	}

}
