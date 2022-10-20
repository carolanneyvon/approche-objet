package fr.diginamic.testenumeration;

public enum Continent {
	ASIE("Asie"),
	EUROPE("Europe"),
	AMERIQUE("Amérique"),
	AFRIQUE("Afrique"),
	OCEANIE("Océanie");
	
	private String libelle;

	// constructeur
	private Continent(String libelle) {
		this.libelle = libelle;
	}

	// getters et setters
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
