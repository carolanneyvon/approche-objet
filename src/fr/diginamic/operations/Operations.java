package fr.diginamic.operations;

public class Operations {
	protected double a;
	protected double b;
	protected char operateur;
	
	// constructeur
	public Operations(double a, double b, char operateur) {
		super();
		this.a = a;
		this.b = b;
		this.operateur = operateur;
	}
	
	// méthode calcul
	public static double getCalcul(double a, double b, char operateur) {
		if (operateur == '+') {
			return a + b;
		}else if (operateur == '-') {
			return a - b;
		}else if (operateur == '*'){
			return a * b;
		}else {
			return a / b;
		}
	}

	// getters et setters
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public char getOperateur() {
		return operateur;
	}

	public void setOperateur(char operateur) {
		this.operateur = operateur;
	}
	
	
}
