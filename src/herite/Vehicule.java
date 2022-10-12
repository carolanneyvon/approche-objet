package herite;

public class Vehicule {

	protected String marque;
	protected String modele;
	//protected Moteur moteur;
	// héritage = ETRE => class Vehicule extends Moteur
	// association = AVOIR => protected Moteur moteur;

	
	// constructeur
	public Vehicule(String marque, String modele) {
		super();
		this.marque = marque;
		this.modele = modele;
	}

	public void demarrer() {
		System.out.println("je suis un véhicule et je démarre");
	}
	
	@Override
	public String toString() {
		return modele+ " " + marque;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

}
