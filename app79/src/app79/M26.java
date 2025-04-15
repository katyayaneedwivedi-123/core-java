package app79;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M26 {
	public static void main(String[] args) {
		String src = "30-11-2024";
		String exp = "[3-9]\\d[-][1-9]\\d[-][2-9]\\d";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
