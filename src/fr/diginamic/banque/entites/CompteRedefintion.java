package fr.diginamic.banque.entites;

public class CompteRedefintion {

	private int numero;
	private double solde;
	
	public CompteRedefintion(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumeroCompte(int numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String toString() {
		return "Le compte n° "+numero+ ", à un solde de "+ solde +" €";
	}
	
}
