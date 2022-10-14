package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		List<Integer> listeEntier = new ArrayList<>();

		listeEntier.addAll(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));

		System.out.println("ListeEntier : " + listeEntier);
		System.out.println("Taille de listeEntier : " + listeEntier.size());

		// recherche du maximum
		Integer max = listeEntier.get(0);

		for (int i = 0; i < listeEntier.size(); i++) {
			if (listeEntier.get(i) > max) {
				max = listeEntier.get(i);
			}
//		for (int i : listeEntier) {
//			if (i > max)
//				max = i;
//			}
		}
		System.out.println("Le plus grand élément est : " + max);

		// recherche du minimum
		Integer min = listeEntier.get(0);

		for (int i = 0; i < listeEntier.size(); i++) {
			if (listeEntier.get(i) < min) {
				min = listeEntier.get(i);
			}
		}
		System.out.println("Le plus petit élément est : " + min);

		// suppression du minimum
		listeEntier.remove(min);
		// si min est en int au lieu de Integer
		// listeEntier.remove(new Integer(min));
		System.out.println("ListeEntier (sans le min) : " + listeEntier);
		
		// recherche des éléments - pour les passer en +
		// la fonction Math.abs() retourne la valeur absolue d'un nombre
		// set pour réécrire la valeur, modifier un élément (index, valeur)
		for (int i = 0; i < listeEntier.size(); i++) {
			if (listeEntier.get(i) < 0) {
				listeEntier.set(i, Math.abs((Integer) listeEntier.get(i)));
			}
		}
		System.out.println("ListeEntier (- en +): "+listeEntier);
	}

}
