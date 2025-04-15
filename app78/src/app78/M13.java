package app78;

public class M13 {
	public static void main(String[] args) {
		String i = "abc";
//		String s1 = String.format("[%(10s]", i);
//		String s1 = String.format("[%010s]", i);
//		String s1 = String.format("[%,10s]", i);
		String s1 = String.format("[%-10s]", i);
		System.out.println(s1);
	}
}
//in String only - flag is allow and all flags are not allow they are give exception
//it we use without the - they are give the FormatFlagsConversionMismatchException