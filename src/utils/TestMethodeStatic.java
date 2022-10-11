package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		String chaine = "12";
		int a = 25;
		int b = 55;

		Integer obj = Integer.parseInt(chaine); 
		// mécanisme autoboxing / unboxing converti un int en integer et inversement
		System.out.println(obj);

		Integer max = Integer.max(a, b);
		System.out.println(max);
		
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);

		// Integer age = null;// permet de ne pas saisir la donnée (null ! 0)
		// int ageInt = age; // null n'est pas équivalent à 0 donc ne compile pas
	
		
	}

}
