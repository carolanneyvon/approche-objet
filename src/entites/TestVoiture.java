package entites;

public class TestVoiture {

	public static void main(String[] args) {
		
		Moteur m1 = new Moteur("ABC", 360);
		Moteur m2 = new Moteur("DEF", 180);
		
		Voiture v1 = new Voiture("Audi", "A3", m1);
		v1.demarrer();
		
		Voiture v2 = new Voiture("Peugeot", "208", m2);
		v2.demarrer();
	}

}
