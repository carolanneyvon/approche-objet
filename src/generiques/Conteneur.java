package generiques;

import java.util.Objects;

public class Conteneur<T, U> {
private T identifiant;
private U valeur;

// constructeur
public Conteneur(T identifiant, U valeur) {
	// contrainte sur U
	// public Conteneur(T identifiant, U extends Ville) {
	super();
	this.identifiant = identifiant;
	this.valeur = valeur;
}

// méthode toString
@Override
public String toString() {
	return "Conteneur [identifiant=" + identifiant + ", valeur=" + valeur + "]";
}

// methode equals
@Override
public int hashCode() {
	return Objects.hash(identifiant, valeur);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Conteneur other = (Conteneur) obj;
	return Objects.equals(identifiant, other.identifiant) && Objects.equals(valeur, other.valeur);
}

// getters et setters
public T getIdentifiant() {
	return identifiant;
}
public void setIdentifiant(T identifiant) {
	this.identifiant = identifiant;
}
public U getValeur() {
	return valeur;
}
public void setValeur(U valeur) {
	this.valeur = valeur;
}



}
