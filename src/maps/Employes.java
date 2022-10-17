package maps;

public class Employes {
 private String prenom;
 private int salaire;
 
 // constructor
public Employes(String prenom, int salaire) {
	super();
	this.prenom = prenom;
	this.salaire = salaire;
}

@Override
public String toString() {
	return "Salarié [prénom = " + prenom + ", salaire = " + salaire + "]";
}

// getters et setters
public String getPrenom() {
	return prenom;
}

public void setNom(String prenom) {
	this.prenom = prenom;
}

public int getSalaire() {
	return salaire;
}

public void setSalaire(int salaire) {
	this.salaire = salaire;
}
 
 
}
