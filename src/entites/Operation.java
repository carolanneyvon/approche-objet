package entites;

public class Operation {
	
	// Pas de variables d'instance donc méthode static recommandé
	// Operation n'a pas de varaibles d'instance => classe stateless

	public static int addition(int a, int b) {
		int c = a+b;
		return c;
	}
}
