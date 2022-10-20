package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static void afficher(Forme forme) {
		System.out.println("Le périmètre du " + forme.getClass().getSimpleName() + " est : " + forme.calculerPerimetre());
		System.out.println("La surface du " + forme.getClass().getSimpleName() + " est : " + forme.calculerSurface());
	}

}
