package app79;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M25 {
	public static void main(String[] args) {
		String src = "917902363526";
		String exp = "^(91)[6-9]\\d{9}$";
		Pattern p = Pattern.compile(exp);
		Matcher m1 = p.matcher(src);
		System.out.println(m1.find());
	}
}
