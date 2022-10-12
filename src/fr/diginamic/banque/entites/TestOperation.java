package fr.diginamic.banque.entites;

import java.text.DecimalFormat;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Credit c1 = new Credit("01/02/2022", 1234);
		Credit c2 = new Credit("02/02/2022", 450);
		Debit d1 = new Debit("03/02/2022", 250);
		Debit d2 = new Debit("04/02/2022", 320);

		Operation[] operations = new Operation[4];
		operations[0] = c1;
		operations[1] = c2;
		operations[2] = d1;
		operations[3] = d2;

		double somme = 0;

		// autre façon d'écrire
//		for (Operation ope : operations) {
//			System.out.println(ope);
//		};

		for (int i = 0; i < operations.length; i++) {
			// == valable que pour les types primitif
			// methode equals pour les Object
			if (operations[i].getType().equals("CREDIT")) {

				somme += operations[i].getMontant();
			} else {
				somme -= operations[i].getMontant();
			}

			// System.out.println(operations[i]+" | Type : "+operations[i].getType());
			// en mettant le getType directement dans le toString dans Operation
			System.out.println(operations[i]);
		}
		
		// pour formateur un nombre
		DecimalFormat formatter = new DecimalFormat(".00");
		String soldeFormat = formatter.format(somme);
		
		//System.out.println("Solde du compte : " + somme + " €");
		System.out.println("Solde du compte : " + soldeFormat + " €");
	}

}
