package app79;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M20 {
	public static void main(String[] args) {
		String src = "@hello";
		String exp = "[a-z]+@[a-z]";
	//	String exp = "@[a-z]";//this expression give the true
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
//before @ is no alphabet so it give the false