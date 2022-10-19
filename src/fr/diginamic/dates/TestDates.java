package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		// instance de la classe java.util.Date
		Date date = new Date(122, 9, 19);
		System.out.println(date);
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormat = format.format(date);
		System.out.println(dateFormat);

	}

}
