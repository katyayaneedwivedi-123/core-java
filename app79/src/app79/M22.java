package app79;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M22 {
	public static void main(String[] args) {
//		String src = "abc.xyz.test@hello";
//		String exp = "^[a-z]([a-z]+\\.)*[a-z]@[a-z]$";
//	    String src = "abc@hello";
//	    String exp = "[a-z]@[a-z]";
//		String src = "abc.xyz@hello";
//		String exp = "^([a-z]+\\.)[a-z]+@[a-z]$";
		String src = "abc.xyz.test.java.blr@hello";
		String exp = "^[a-z]+\\.+([a-z]+\\.)*[a-z]+@[a-z]+$";
//		String exp = "^[a-z]([a-z]+\\.)*[a-z]+@[a-z]+$";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
//for the last src both exp  are correct
//we are not use the if and else we check the entire String 
//it give the true or false 