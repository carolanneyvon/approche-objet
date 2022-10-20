package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS ("Printemps", 1),
	ETE ("Eté", 2),
	AUTOMNE ("Automne", 3),
	HIVER ("Hiver", 4);
	
	private String libelle;
	private int ordre;
	
	// constructeur
	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}
	
	// méthode qui retourne une instance de Saison en fonction du libellé
	public static Saison getSaison(String libelle) {
		String libelleFormate = libelle.toUpperCase();
		return valueOf(libelleFormate);
	}
	
	// getters et setters
	public String getLibelle() {
		return libelle;
	}

	public void setLibellé(String libelle) {
		this.libelle = libelle;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
	
	
	
}
