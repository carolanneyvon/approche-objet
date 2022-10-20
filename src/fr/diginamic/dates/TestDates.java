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
		
		Date date2 = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateFormat2 = format2.format(date2);
		System.out.println(dateFormat2);
		
		Date dateMoment = new Date();
		String dateMomentFormat = format2.format(dateMoment);
		System.out.println(dateMomentFormat);

	}

}
