package fr.diginamic.testenumeration;

import java.util.ArrayList;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		ArrayList<Ville> liste = new ArrayList<>();
		liste.add(new Ville("New York", 8_200_000, Continent.AMERIQUE));
		liste.add(new Ville("Paris", 2_161_000, Continent.EUROPE));
		liste.add(new Ville("Pékin", 21_540_000, Continent.ASIE));
		liste.add(new Ville("Moscou", 11_920_000, Continent.EUROPE));
		liste.add(new Ville("Berlin", 3_645_000, Continent.EUROPE));
		liste.add(new Ville("Sydney", 5_312_000, Continent.OCEANIE));
		liste.add(new Ville("Sao Paulo", 12_330_000, Continent.AMERIQUE));
		liste.add(new Ville("Dakar", 1_146_000, Continent.AFRIQUE));
		
		for (Ville villes : liste) {
			System.out.println(villes);
		}
	}

}
