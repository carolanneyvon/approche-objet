package entites;

public class Emprunt {

	public int annee;

	// seule méthode qui commence par une maj
	// car même nom que la class

	// constructeur sans paramètre
	public Emprunt() {
		annee = 2021;
	}

	// constructeur avec paramètre
	// portée de nvAnnee = boc du constructeur
	public Emprunt(int nvAnnee) {
		annee = nvAnnee;
	}

//	public Emprunt(int annee) {
//		this.annee = annee;
//	}

}
