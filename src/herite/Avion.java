package herite;

public class Avion extends Vehicule {

	private String matricule;

	//constructeur
	public Avion(String marque, String modele, String matricule) {
		super(marque, modele);
		this.matricule = matricule;
	}
	
	@Override
	// pour signaler la redefinition d'une méthode
	public void demarrer() {
		System.out.println("je suis un avion et je décolle");
	}
	
//	public void decoller() {
//		demarrer();
//	}
	
	
	// @Overload
	// surcharge de la méthode car ajout d'un paramètre
//	public void demarrer(String a) {
//		System.out.println("je suis un avion et je décolle");
//	}
	
	@Override
	public String toString() {
		// return matricule + " " + getModele()+ " " + getMarque(); // si private
		// return matricule + " " + modele+ " " + marque; // si en protected
		return matricule + " " + super.toString(); // en faisant d'abord appelle à la classe mère
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

}
