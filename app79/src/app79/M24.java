package app79;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M24 {
	public static void main(String[] args) {
		String src = "abc@hello.s.com";
		String exp = "[a-z]+@[a-z]+\\.+[a-z]\\.[a-z]";
//		String exp = "[a-zA-Z_]+@([a-zA-Z0-9_]+\\.)*[a-zA-Z0-9_]+\\.[a-z]{2,}$";
//		String exp = "[a-zA-Z_]+@[a-zA-Z0-9_]+([a-zA-Z0-9_]+\\.)*\\.[a-z]{2,}$";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
//all are the expression are the true