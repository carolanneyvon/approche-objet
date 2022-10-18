package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		String cheminStr = "C:\\Caro\\CDA\\java\\Supports\\7 - Langage Java - Approche Objet\\J5 & J6 - Collections et fichiers\\TP\\recensement.csv";
		Path path = Paths.get(cheminStr);

		// Lecture du contenu du fichier
		List<String> lignes = Files.readAllLines(path, StandardCharsets.UTF_8);

		// Ecrire dans le nouveau fichier les 100 premières lignes de recensement
		List<String> nvFichier = new ArrayList<String>();

		for (int i = 0; i < 100; i++) {
			nvFichier.add(lignes.get(i));
		}
		System.out.println(nvFichier.size());

		// Nouveau fichier
		String newCheminStr = "C:\\Caro\\CDA\\java\\Supports\\7 - Langage Java - Approche Objet\\J5 & J6 - Collections et fichiers\\TP\\nouveauFichier.csv";
		Path newPath = Paths.get(newCheminStr);
		Files.write(newPath, nvFichier);

		// Lecture et affichage du nouveau fichier
		List<String> lignes2 = Files.readAllLines(path, StandardCharsets.UTF_8);
		for (String l : lignes2) {
			System.out.println(l);
		}
	}

}
