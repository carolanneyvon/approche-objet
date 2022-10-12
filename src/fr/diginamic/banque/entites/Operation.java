package fr.diginamic.banque.entites;

public abstract class Operation {
	protected String date;
	protected int montant;

	public Operation(String date, int montant) {
		super();
		this.date = date;
		this.montant = montant;
	}

	@Override
	public String toString() {
		return "Date : " + date + " | Montant : " + montant +  " € | Type d'opération : "+ getType() ;
	}

	public abstract String getType();
	
	// getters et setters
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

}
