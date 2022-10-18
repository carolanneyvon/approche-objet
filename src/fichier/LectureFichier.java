package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {

		// Exercice LireFichier

		String cheminStr = "C:\\Caro\\CDA\\java\\Supports\\7 - Langage Java - Approche Objet\\J5 & J6 - Collections et fichiers\\TP\\recensement.csv";
		Path path = Paths.get(cheminStr);

		// Lecture et affichage du contenu du fichier
		List<String> lignes = Files.readAllLines(path, StandardCharsets.UTF_8);
		for (String l : lignes) {
			System.out.println(l);
		}

		// Exercice LireFichierAvecInstanciation

		// ArrayList vide
		ArrayList<Ville> listeVilles = new ArrayList<>();

		// Création instance Ville
		// La méthode split permet de découper une ligne en
		// tableau de chaine de caractères sur la base d’un séparateur
		for (int i = 1; i < lignes.size(); i++) {
			String[] liste = lignes.get(i).split(";");
			String nom = liste[6];
			String departement = liste[2];
			String region = liste[1];
			int population = Integer.valueOf(liste[9].replaceAll(" ", ""));

			Ville v = new Ville(nom, departement, region, population);
			listeVilles.add(v);
			// System.out.println(listeVilles.get(i - 1));
		}
		System.out.println("--------------------");
		System.out.println("Nombre de Ville : " + listeVilles.size());

		// Exercice GenererFichier

		// Recherche des villes avec plus de 25000 habitants
		// Ajout dans le nouveau fichier
		List<String> villesPop = new ArrayList<String>();
		// création de la première ligne = titre colonne
		villesPop.add("Nom;Département;Region;Population;");

		for (Ville villes : listeVilles) {
			if (villes.getPopulation() > 25000) {
				villesPop.add(villes.getNom() + ";" + villes.getDepartement() + ";" + villes.getRegion() + ";"
						+ villes.getPopulation());
			}
		}
		System.out.println("--------------------");
		System.out.println("Nombre de Ville (population > 25000) : " + villesPop.size());

		// Creation nouveau fichier
		String newCheminVille = "C:\\Caro\\CDA\\java\\Supports\\7 - Langage Java - Approche Objet\\J5 & J6 - Collections et fichiers\\TP\\villesPop.csv";
		Path newPath = Paths.get(newCheminVille);
		Files.write(newPath, villesPop);

		// Lecture et affichage du nouveau fichier
		System.out.println("--------------------");
//		List<String> lignesVilles = Files.readAllLines(newPath, StandardCharsets.UTF_8);
//		for (String l : lignesVilles) {
//			System.out.println(l);
//		}
	}

}
