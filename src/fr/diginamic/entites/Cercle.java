package fr.diginamic.entites;

public class Cercle {
	protected double rayon;
	static final double PI = Math.PI;

	// construteur
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	// calcul du périmètre du cercle
	public double perimetre() {
		return 2 * PI * rayon;
	}

	// calcul de la surface du cercle
	public double surface() {
		return 2 * rayon * rayon;
	}

	@Override
	public String toString() {
		return "Rayon : " + rayon + " | Perimètre : " + perimetre() + " | Surface : " + surface();
	}

}
