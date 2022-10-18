package fichier;

public class Ville {
	private String nom;
	private String departement;
	private String region;
	private int population;

	// constructeur
	public Ville(String nom, String departement, String region, int population) {
		super();
		this.nom = nom;
		this.departement = departement;
		this.region = region;
		this.population = population;
	}

	@Override
	public String toString() {
		return "Ville [nom = " + nom + ", departement = " + departement + ", region = " + region + ", population = "
				+ population + "]";
	}

	// getters et setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}
