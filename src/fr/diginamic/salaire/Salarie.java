package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	private double salaireMensuel;

	// constructeur
	public Salarie(String nom, String prenom, double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return salaireMensuel;
	}
	
	@Override
	public String getStatut() {
		return "Salarié";
	}
	
	// getters et setters
	public double getSalaireMensuel() {
		return salaireMensuel;
	}

	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}
	
	
}
