package app80;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class M3 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		System.out.println(date);
		
		SimpleDateFormat sf = new SimpleDateFormat();
		//sf.applyPattern("EEE, MMM, "yy");
		//sf.applyPattern(h:mm a");
		//sf.applyPattern("hh 'o"clock'a, zzzz");
		//sf.applyPattern("K:mm a,z");
		//sf.applyPattern("yyyyy.MMMMM.dd GGG hh:mm aaa");
		//sf.applyPattern("EEE,d MMM yyyy HH:mm:ssZ);
		//sf.applyPattern("yyMMddHHmmssZ");
		//sf.applyPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		//sf.applyPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
		sf.applyPattern("YYYY-'W'ww-u");
		String s1 = sf.format(date);
		System.out.println(s1);
		try {
			Date d1 = sf.parse(s1);
			System.out.println(s1);
		}
		catch(ParseException ex) {
			ex.printStackTrace();
		}
	}
}
