package heritage;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
	public static void main(String[] args) {
//		ArrayList<String> liste = new ArrayList<>();
//		// <String>, <Integer>....
//		liste.add("coucou");
//		liste.add("bonjour");
//		
//		System.out.println(liste);
//		System.out.println(liste.get(1));
//		System.out.println(liste.size());
//		System.out.println(liste.isEmpty());

		User u1 = new User("Hello", "World");
		User u2 = new User("Hari", "Bot");
		User u3 = new User("Tata", "Toto");

		ArrayList<User> liste = new ArrayList<>();
		liste.add(u1);
		liste.add(u2);
		liste.add(null);
		liste.add(u3);
		
		// pour ne pas passer par une variable intermédiaire
		liste.add(new User("test", "autre"));

		// Boucle indexée
		// for (int i = 0; i <= liste.size()-1; i++)
		for (int i = 0; i < liste.size(); i++) {
			User a = liste.get(i);
			System.out.println(a);
		}
		System.out.println("--------------------");

		// Boucle non indexée
		for (User a : liste) {
			System.out.println(a);
		}
		System.out.println("--------------------");

		// Technique de l'iterator
		// permet de supprimer des elements pendant que l'on parcours une liste
		Iterator<User> it = liste.iterator();
		while (it.hasNext()) { // tant qu'il y a des chose ds l'iterator
			User u = it.next();
			System.out.println(u);
			if (u == null || u.getNom().equals("Hello")) {
				it.remove();
			}
		}
		System.out.println("--------------------");
		System.out.println(liste);
	}
}
