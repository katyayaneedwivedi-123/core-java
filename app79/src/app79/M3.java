package app79;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M3 {
	public static void main(String[] args) {
		String src = "aababcabcdadcde";
		String exp = "[abc]";
		
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find()) {
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}
//whatever we are mention inside [] bracket it search the individual character 