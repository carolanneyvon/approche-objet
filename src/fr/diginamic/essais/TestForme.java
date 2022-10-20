package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(5);
		Rectangle rectangle1 = new Rectangle(7, 4);
		Carre carre1 = new Carre(9);
		
		AffichageForme.afficher(cercle1);
		AffichageForme.afficher(rectangle1);
		AffichageForme.afficher(carre1);

	}

}
