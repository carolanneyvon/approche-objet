package entites;

public class Facture {

	private double consommationKwh;
	private double montant;

	private static double coutKwh = 0.15;

	public Facture(double consommationKwh) {
		this.consommationKwh = consommationKwh;
		// this.montant = consommationKwh * coutKwh;
		recalculerMontant();
	}

	
	private void recalculerMontant() {
		this.montant = consommationKwh * coutKwh;
	}

	public void modifierFacture(double nvConsommation) {
		// Je modifie la consommation
		this.consommationKwh = nvConsommation;
		// Je recalcule le montant
		recalculerMontant();
	}

	
	public double getConsommationKwh() {
		return consommationKwh;
	}

	public double getMontant() {
		return montant;
	}

}
