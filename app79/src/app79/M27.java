package app79;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M27 {
	public static void main(String[] args) {
		String src = "{(x^2 - y^3 - xy)}";
		String exp = "\\{\\(x\\^\\d - y\\^\\d - xy\\)\\}";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
