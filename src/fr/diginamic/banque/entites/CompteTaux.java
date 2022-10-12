package fr.diginamic.banque.entites;

public class CompteTaux extends CompteRedefintion {
 private double taux;

public CompteTaux(int numero, double solde, double taux) {
	super(numero, solde);
	this.taux = taux;
}

	@Override
	public String toString() {
		return super.toString()+" et un taux à "+taux+"%";
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
}
