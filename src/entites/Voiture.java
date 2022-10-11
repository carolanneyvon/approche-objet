package entites;

public class Voiture {

	// Variables d'instance
	String modele;
	String nom;

	// Les contructeurs
	public Voiture(String modele, String nom, Moteur moteur) {
		this.modele = modele;
		this.nom = nom;
	}

	// Puis les méthodes
	public void demarrer() {
		System.out.println("Je demarre ma " + modele + " " + nom);
		mettreLeContact();
	}

	public void mettreLeContact() {
		System.out.println("Je met le contact");
	}
}
