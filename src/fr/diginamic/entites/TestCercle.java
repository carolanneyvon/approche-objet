package fr.diginamic.entites;

import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle c1 = new Cercle(5);
		Cercle c2 = new Cercle(8);
		Cercle c3 = CercleFactory.retourCercle(9);
		//Cercle[] cercles = {new Cercle(5), new Cercle(8), c};
		Cercle[] cercles = {c1, c2, c3};
		
		for (int i = 0; i < cercles.length; i++) {
			System.out.println(cercles[i]);
		}
	}

}
