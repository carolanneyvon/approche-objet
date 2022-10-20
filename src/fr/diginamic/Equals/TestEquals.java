package fr.diginamic.Equals;

public class TestEquals {

	public static void main(String[] args) {
		// test1 : 2 instances de villes qui ont les mêmes attributs
		Ville ville1 = new Ville("TestEqual", 123456);
		Ville ville2 = new Ville("TestEqual", 123456);

		boolean test1 = ville1.equals(ville2);
		System.out.println("Test1 = Mêmes attributs : " + test1); // true

		// test2 : retourne false si vous changez un des attributs
		Ville ville3 = new Ville("TestEqual", 78910);
		Ville ville4 = new Ville("TestEqual", 123456);

		boolean test2 = ville3.equals(ville4);
		System.out.println("Test2 = Mêmes attributs : " + test2); // false

		// test3 : == avec les mêmes attributs
		System.out.println("Test3 = Mêmes attributs (==) : " + (ville1 == ville2)); // false

		// test4 : == avec des attributs différents
		System.out.println("Test4 = Mêmes attributs (==): " + (ville3 == ville4)); // false

		// test5 : comparaison de 2 villes avec l’opérateur == retourne true
		Ville villeComp = ville1;
		System.out.println("Test5 = Mêmes attributs (==): " + (villeComp == ville1));

	}
}
