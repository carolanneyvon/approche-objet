package maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {
		// création de la Map
		HashMap<String, Employes> mapSalaires = new HashMap<>();
		mapSalaires.put("Paul", new Employes("Paul", 1750));
		mapSalaires.put("Hicham", new Employes("Hicham", 1825));
		mapSalaires.put("Yu", new Employes("Yu", 2250));
		mapSalaires.put("Ingrid", new Employes("Ingrid", 2015));
		mapSalaires.put("Chantal", new Employes("Chantal", 2418));
	
		System.out.println("Taille de la map : "+mapSalaires.size());
	}
	
}
