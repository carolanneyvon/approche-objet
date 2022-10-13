package fr.diginamic.operations;

// renvoie une représentation sous forme de string du contenu du array spécifié
import java.util.Arrays;

public class CalculMoyenne {
	protected double[] tab = new double[0];
	
	
	// constructeur 
	public CalculMoyenne(double[] tab) {
		super();
		this.tab = tab;
	}
	
	// méthode ajout
	public void getAjout(double a) {
		double [] newTab = new double [tab.length+1];
		for (int i = 0; i < tab.length; i++) {
			newTab[i] = tab[i];
		}
		newTab[newTab.length-1] = a;
		this.tab = newTab;
	}
	
	// méthode calcul
	public double getCalcul() {
		double somme = 0;
		double moyenne = 0;
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		moyenne = somme / tab.length;
		return moyenne;
	}
	
	@Override
	public String toString() {
		return "Les valeurs du tableau sont : "+ Arrays.toString(tab);
	}

	// getters et setters
	public double[] getTab() {
		return tab;
	}

	public void setTab(double[] tab) {
		this.tab = tab;
	}
	
	
	
}
