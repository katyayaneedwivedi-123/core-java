package app79;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M5 {
	public static void main(String[] args) {
		String src = "a1b2c3test5hellojava";
		String exp = "[138]";
		
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find()) {
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}
//it search for occurrence for 1 3 and 8