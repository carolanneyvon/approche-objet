package fr.diginamic.salaire;

public abstract class Intervenant {
	private String nom;
	private String prenom;
	
	// construteur
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	// methode getSalaire()
	public abstract double getSalaire();
	
	// methode getStatut()
	public abstract String getStatut();
	
	
	@Override
	public String toString() {
		return "[Nom = " + nom + "| Prénom = " + prenom + "| Salaire = " + getSalaire() + " € ]";
	}
	
	// methode afficherDonnees, equivalent à la méthode toString
	// mais contient le syso donc au niveau du test, on appel juste la méthode
	public void afficherDonnees() {
		System.out.println("Nom : " + nom + " |  Prénom :  " + prenom + " |  Salaire : " + getSalaire() + " € | Statut : " + getStatut());
	}

	// getters et setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
