package app79;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M23 {
	public static void main(String[] args) {
		String src = "a1.B.c1.d5@hello";
//		String exp = "[a-z0-9]+\\.+[A-Z]+\\.+[a-z0-9]+\\.+[a-z0-9]+@[a-z]+$";
		String exp = "^[a-zA-Z]([a-zA-Z0-9_]+\\.)*[a-zA-Z0-9_]+@[a-z]+$";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
//both are the expression are true
//inn this regular expression we use also lower and upper digit all are allow