package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		String cheminStr = "C:\\Caro\\CDA\\java\\Supports\\7 - Langage Java - Approche Objet\\J5 & J6 - Collections et fichiers\\TP\\recensement.csv";
		Path path = Paths.get(cheminStr);

		// Lecture et affichage du contenu du fichier
		List<String> lignes = Files.readAllLines(path, StandardCharsets.UTF_8);

		for (String l : lignes) {
			System.out.println(l);
		}

	}

}
