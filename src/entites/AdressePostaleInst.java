package entites;

// TP2

public class AdressePostaleInst {

	// Le but d'un contructeur est de valoriser les variables suivantes:
	public int numeroRue;
	public String libelleRue;
	public int codePostal;
	public String ville;

	public AdressePostaleInst(int numeroRue, String libelleRue, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	public void setVille(String nvVille) {
		this.ville = nvVille;
	}

}
