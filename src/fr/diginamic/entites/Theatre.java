package fr.diginamic.entites;

public class Theatre {
	protected String nom;
	protected int capaciteMax;
	protected int nbInscrit;
	protected int recetteTotale;
	
	// constructeur
	public Theatre(String nom, int capaciteMax, int nbInscrit, int recetteTotale) {
		super();
		this.nom = nom;
		this.capaciteMax = capaciteMax;
		this.nbInscrit = nbInscrit;
		this.recetteTotale = recetteTotale;
	}

	// méthode inscrire
	public void getInscrire(int client, int prix) {
		if ((this.nbInscrit + client) <= capaciteMax) {
			this.nbInscrit += client;
			this.recetteTotale = this.nbInscrit * prix;
			System.out.println("Nombre de client inscrit : "+nbInscrit+ "/"+ capaciteMax);

		}
		else {
			System.out.println("La capacité maximale du théâtre est atteinte");
		}
	}
	
	// getters et setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public int getNbInscrit() {
		return nbInscrit;
	}

	public void setNbInscrit(int nbInscrit) {
		this.nbInscrit = nbInscrit;
	}

	public int getRecetteTotale() {
		return recetteTotale;
	}

	public void setRecetteTotale(int recetteTotale) {
		this.recetteTotale = recetteTotale;
	}
	
	
}
