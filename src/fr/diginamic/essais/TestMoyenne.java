package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		CalculMoyenne tab1 = new CalculMoyenne(new double[0]);
		CalculMoyenne tab2 = new CalculMoyenne(new double[0]);
		// sans le constructeur
		//CalculMoyenne tab3 = new CalculMoyenne();
		
		tab1.getAjout(15);
		tab1.getAjout(12.5);
		tab1.getAjout(9);
		System.out.println(tab1);
		System.out.println("La moyenne est de "+ tab1.getCalcul());
		
		
		tab2.getAjout(9);
		tab2.getAjout(18.5);
		tab2.getAjout(10);
		System.out.println(tab2);
		System.out.println("La moyenne est de "+ tab2.getCalcul());
		
		
	}

}
