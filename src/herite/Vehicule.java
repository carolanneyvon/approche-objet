package herite;

public class Vehicule {

	protected String marque;
	protected String modele;

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
