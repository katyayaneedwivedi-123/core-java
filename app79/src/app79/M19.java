package app79;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M19 {
	public static void main(String[] args) {
		String src = "abc@hello";
		String exp = "[a-z]+@[a-z]";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
//if before @ one more lower case alphabet and after @ alphabet
//then we use this
//it check entire String and give true
//+operator is not or anything it represent one or more 