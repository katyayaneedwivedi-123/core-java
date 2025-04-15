package app76;

public class M13 {
	public static void main(String[] args) {
		String s1 = "abc";
		System.out.println(s1);
		s1.toUpperCase();
		System.out.println(s1);
	}
}
//toUpperCase method convert all the lower case into the upper case
//it also handle the special character
//but it change only the lower case alphabet it not changed the numeric 
//toLowerCase method covert all the upper case into the lower case
//toLowerCase method also change only the upper case alphabet not numeric
//toUpperCase and toLowerCase both are the case Locale-sensitive
//Locale means - If no locale is specified, it uses the default locale of the Java Virtual Machine (JVM).