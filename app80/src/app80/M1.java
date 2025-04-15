package app80;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class M1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		System.out.println(date);
		
		SimpleDateFormat sf = new SimpleDateFormat();
		String s1 = sf.format(date);
		System.out.println(s1);
		try {
			Date d1 = sf.parse(s1);
			System.out.println(d1);
		}
		catch(ParseException ex) {
			ex.printStackTrace();
		}
	}
}
//we use the Calendar and date for the use to give the day month date
//time and year
//then we use simple  date format for print the date and time
//then we use the try and catch it handle the parse exception
//and it print the day month date time and year