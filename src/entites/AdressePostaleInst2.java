package entites;

public class AdressePostaleInst2 {

	// Le but d'un contructeur est de valoriser les variables d'instance suivantes:
	private int numeroRue;
	private String libelleRue;
	private int codePostal;
	private String ville;
	
	// Variable de classe (i.e static) = Valeur partagée
	private static String pays = "FRANCE";

	//Constructeur
	public AdressePostaleInst2(int numeroRue, String libelleRue, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	//Méthode static
	//Elle ne peut acceder qu'au variables et méthodes static
	public static String getPays() {
		return pays;
	}
	
	//Getters et Setters
	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	


}
