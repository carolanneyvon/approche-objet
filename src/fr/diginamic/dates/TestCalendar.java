package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// instance de la classe java.util.Calendar
		Calendar calendar = Calendar.getInstance();

		calendar.set(2016, 4, 19, 23, 59, 30);
		SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
		String dateFormat = format1.format(calendar.getTime());
		System.out.println(dateFormat);

		Calendar dateMoment = Calendar.getInstance();

		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateFormat2 = format2.format(dateMoment.getTime());
		System.out.println("Date du moment : " + dateFormat2);

		// Francais
		SimpleDateFormat format4 = new SimpleDateFormat("'Le' EEEE dd MMM yyyy 'à' HH:mm:ss", Locale.FRENCH);
		String dateFormat4 = format4.format(dateMoment.getTime());
		System.out.println("Français : "+ dateFormat4);

		// Russe
		SimpleDateFormat format5 = new SimpleDateFormat("'Le' EEEE dd MMM yyyy 'à' HH:mm:ss", new Locale("ru", "RU"));
		String dateFormat5 = format5.format(dateMoment.getTime());
		System.out.println("Russe : "+dateFormat5);

		// Chinois
		SimpleDateFormat format6 = new SimpleDateFormat("'Le' EEEE dd MMM yyyy 'à' HH:mm:ss", Locale.CHINESE);
		String dateFormat6 = format6.format(dateMoment.getTime());
		System.out.println("Chinois : "+dateFormat6);

		// Allemand
		SimpleDateFormat format7 = new SimpleDateFormat("'Le' EEEE dd MMM yyyy 'à' HH:mm:ss", Locale.GERMAN);
		String dateFormat7 = format7.format(dateMoment.getTime());
		System.out.println("Allemand : "+dateFormat7);

		// Anglais
		SimpleDateFormat format3 = new SimpleDateFormat("'Le' EEEE dd MMM yyyy 'à' hh:mm:ss", Locale.ENGLISH);
		String dateFormat3 = format3.format(dateMoment.getTime());
		System.out.println("Anglais : "+dateFormat3);

	}

}
