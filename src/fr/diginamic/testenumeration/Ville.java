package fr.diginamic.testenumeration;

public class Ville {
	private String nom;
	private int nbHabitants;
	private Continent continent;

	// constructeur
	public Ville(String nom, int nbHabitants, Continent continent) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "[Nom : " + nom + " | Nombre d'habitants : " + nbHabitants + " | Continent : " + continent + "], ";
	}

	// getters et setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
