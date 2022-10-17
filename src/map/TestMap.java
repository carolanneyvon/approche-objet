package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {

		// création de la Map
		HashMap<Integer, User> map = new HashMap<>();
		//HashMap<String, User> map = new HashMap<>();
		
		// alimentation de la map avec la méthode put
		// clé de stockage unique (ici 0 ou "a")
		map.put(0, new User("Durand", "autre", 35));
		//map.put("a", new User("Durand", "autre", 35));
		map.put(1, new User("Axel", "autre", 42));
		map.put(2, new User("Aurélie", "autre", 28));
		map.put(3, new User("TEst", "autre", 28));

		System.out.println(map.size());
		
		User u = map.get(2);
		//User u = map.get("a");
		System.out.println(u);
		
		// clé de stockage permet aussi de faire un remove
		map.remove(3);
		System.out.println(map.size());
		
		// récuperer l'ensemble des clés
		Set<Integer> keys = map.keySet();
		for (Integer k : keys) {
			System.out.println(k);
		}
		
		// Récupération de l'ensemble des valeurs
		// Collection est l'interface mère d'ArrayList
		Collection<User> users = map.values();
		for (User us : users) {
			System.out.println(us);
		}
	}

}
