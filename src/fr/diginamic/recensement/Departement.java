package fr.diginamic.recensement;

public class Departement {
	private String nom;
	private int population;
	
	public Departement(String nom, int population) {
		super();
		this.nom = nom;
		this.population = population;
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	
	
	
}
