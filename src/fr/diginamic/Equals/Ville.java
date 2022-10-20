package fr.diginamic.Equals;

public class Ville {
	private String nom;
	private int nbHabitants;
	
	// constructeur
	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	@Override
	public boolean equals(Object objet) {
		// si l'objet n'est pas une ville retourne false
		if (!(objet instanceof Ville)) {
			return false;
		}
		Ville autre = (Ville)objet;
		return ((this.nom==null && autre.getNom()==null) || this.nom.equals(autre.getNom())) && this.nbHabitants == autre.getNbHabitants();
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

	@Override
	public String toString() {
		return "[Nom : " + nom + "| Nombre d'habitants : " + nbHabitants + "], ";
	}
	

	
}
