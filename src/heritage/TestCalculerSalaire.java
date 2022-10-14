package heritage;

public class TestCalculerSalaire {
 public static void main(String[] args) {
	 CalculerSalaireService calcul = new CalculerSalaireService();
	 calcul.calculer(new Pilote());
	 calcul.calculer(new PersonnelSol());
	 
	 calcul.traiter(new Pilote());
	 calcul.traiter(new PersonnelSol());

 }
}
