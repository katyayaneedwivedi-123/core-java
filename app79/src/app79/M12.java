package app79;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M12 {
	public static void main(String[] args) {
		String src = "a_RE34$#@17Hello";
		String exp = "\\w+";
		
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find()) {
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}
//"\\w+" is represent the one or more world character