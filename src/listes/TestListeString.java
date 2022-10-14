package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {
		List<String> listeVille = new ArrayList<>();

		listeVille.addAll(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix","Pau","Marseille", "Tarbes"));
		System.out.println("ListeVille : " + listeVille);
		
		// ville ayant le plus grand nombre de lettres
		String maxVille = "";
		int maxLettre = 0;
		for (int i = 0; i < listeVille.size(); i++) {
			if (listeVille.get(i).length() > maxLettre) {
				maxLettre = listeVille.get(i).length();
				maxVille = listeVille.get(i);
			}
		}
		System.out.println("Le ville ayant le plus grand nombre de lettres : "+maxVille +" ("+maxLettre+" lettres)");
	
		// noms des villes en majuscules
		for (int i = 0; i < listeVille.size(); i++) {
			listeVille.set(i, (listeVille.get(i)).toUpperCase());
		}
		System.out.println("Noms des villes en majuscules: "+listeVille);
	
		// suppression des villes dont le nom commence par N
		// https://www.w3schools.com/java/java_ref_string.asp
		// méthode charAt(0) renvoie le premier caractère (0) d'une chaîne
		Iterator<String> it = listeVille.iterator();
		
		while (it.hasNext()) { 
			String u = it.next();
			if (u.charAt(0) == 'N') {
				it.remove();
			}
		}
		System.out.println("ListeVille (sans N) : " + listeVille);
	}

}
