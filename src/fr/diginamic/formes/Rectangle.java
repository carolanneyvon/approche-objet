package fr.diginamic.formes;

public class Rectangle extends Forme{
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		return (2 * longueur) + (2 * largeur);
	}

	@Override
	public double calculerSPerimetre() {
		return longueur * largeur;
	}

	// getters et setters
	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	
	
}
