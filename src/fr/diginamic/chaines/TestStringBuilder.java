package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {

		// avec StringBuilder
		StringBuilder builder = new StringBuilder();
		// début chronométrage
		long debut = System.currentTimeMillis();

		for (int i = 1; i <= 100000; i++) {
			builder.append(i);
		}

		// fin chronométrage
		long fin = System.currentTimeMillis();
		
		System.out.println("Temps écoulé en millisecondes builder :" + (fin - debut)); // 12ms - 9ms

		// avec String et l’opérateur de concaténation +
		String string = "";
		// début chronométrage
		long debut2 = System.currentTimeMillis();

		for (int i = 1; i <= 100000; i++) {
			string += i;
		}

		// fin chronométrage
		long fin2 = System.currentTimeMillis();

		System.out.println("Temps écoulé en millisecondes string :" + (fin2 - debut2)); // 10782ms - 8728ms
	}

}
