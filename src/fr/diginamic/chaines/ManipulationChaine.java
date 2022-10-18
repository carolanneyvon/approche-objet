package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		
		// 1) afficher le premier caractère de la chaine de caractères
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère : " + premierCaractere);
		
		// 2) afficher la longueur de la chaine de caractères
		int longueurChaine = chaine.length();
		System.out.println("Longueur de la chaine : "+longueurChaine);
		
		// 3) afficher l’index du premier « ; »
		int indexPointVirgule = chaine.indexOf(';');
		System.out.println("Index du premier \";\" : "+indexPointVirgule);

		// 4) extraire une portion de chaine de caractères
		String nomFamille = chaine.substring(chaine.indexOf(chaine.charAt(0)), chaine.indexOf(';'));
		System.out.println("Nom de famille : "+nomFamille);
		
		// 5) afficher le nom de famille en majuscules
		System.out.println("Nom de famille en majuscules: "+nomFamille.toUpperCase());
		
		// 6) afficher le nom de famille en minuscules
		System.out.println("Nom de famille en minuscules: "+nomFamille.toLowerCase());
		
		// 7) découper la chaine de caractères en morceaux
		System.out.println("--------------------");
		System.out.println("Tableau obtenu avec la méthode split : ");
		String decoupe[]=chaine.split(";");
		for (int i=0; i<decoupe.length; i++) {
			System.out.println(decoupe[i]);
		}
		
		// 8) classe Salarie dans le package entites
		
		// 8) instance de Salarie
		Salarie salarie1 = new Salarie(decoupe[0],decoupe[1],Double.parseDouble(decoupe[2].replace(" ","")));
		System.out.println("--------------------");
		System.out.println(salarie1);
	}
}
