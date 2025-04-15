package app79;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M7 {
	public static void main(String[] args) {
		String src = "abc123test345hello567";
		String exp = "\\d";
		
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find()) {
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}
// \\d represent the digit in 0 to 9
//we can not provide the only one \ in " " we provide the one more \\
//we can not provide direct inside " "