package fr.diginamic.formes;

public class Cercle extends Forme{
	protected double rayon;
	static final double PI = Math.PI;

	// construteur
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	// calcul du périmètre du cercle
	public double calculerSPerimetre() {
		return 2 * PI * rayon;
	}

	// calcul de la surface du cercle
	public double calculerSurface() {
		return 2 * rayon * rayon;
	}

	@Override
	public String toString() {
		return "Rayon : " + rayon + " | Perimètre : " + calculerSPerimetre() + " | Surface : " + calculerSurface();
	}

	// getters et setters
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	

}
