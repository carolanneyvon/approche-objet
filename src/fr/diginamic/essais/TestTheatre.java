package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre theatre1 = new Theatre("Théatre du rêves", 150, 0, 0);

		theatre1.getInscrire(25, 15);
		theatre1.getInscrire(25, 15);
		theatre1.getInscrire(25, 15);
		theatre1.getInscrire(25, 15);
		theatre1.getInscrire(25, 15);
		theatre1.getInscrire(25, 15);
		theatre1.getInscrire(25, 15);
		
		System.out.println("Nombre de clients inscrit : "+theatre1.getNbInscrit() + " | Recette totale : "+ theatre1.getRecetteTotale()+ " €");
	}

}
