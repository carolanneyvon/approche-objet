package fr.diginamic.banque.entites;

public class CompteRedefintion {

	private int numeroCompte;
	private double soldeCompte;
	
	public CompteRedefintion(int numeroCompte, double soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}
	
	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public String toString() {
		return "Numéro de compte "+numeroCompte+ ", dont le solde est de "+ soldeCompte +" €";
	}
	
}
