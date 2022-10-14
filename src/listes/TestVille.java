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
		//System.out.println(liste);
	}

}
