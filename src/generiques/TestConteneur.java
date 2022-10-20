package generiques;

import listes.Ville;

public class TestConteneur {

	public static void main(String[] args) {
		Conteneur<Integer, String> c1 = new Conteneur<>(15, "Bonjour");
		Conteneur<String, Ville> c2 = new Conteneur<>("A0123", new Ville("Nantes", 15420));

	}

}
