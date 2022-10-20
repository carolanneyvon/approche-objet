package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	private double nbJour;
	private double remJour;
	
	// constructeur
	public Pigiste(String nom, String prenom, double nbJour, double remJour) {
		super(nom, prenom);
		this.nbJour = nbJour;
		this.remJour = remJour;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return nbJour * remJour;
	}
	
	@Override
	public String getStatut() {
		return "Pigiste";
	}

	// getters et setters
	public double getNbJour() {
		return nbJour;
	}

	public void setNbJour(double nbJour) {
		this.nbJour = nbJour;
	}

	public double getRemJour() {
		return remJour;
	}

	public void setRemJour(double remJour) {
		this.remJour = remJour;
	}

	
}
