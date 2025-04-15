package app78;

public class M10 {
	public static void main(String[] args) {
		int i = 22;
		String s1 = String.format("[%-1d]", i);//if we mention 01 then it required minimum
		System.out.println(s1);
		String s2 = String.format("[%-5d]", i);
		System.out.println(s2);
		String s3 = String.format("[%-15d]", i);
		System.out.println(s3);
		System.out.printf("{%-2d}\n", i);
		System.out.printf("{%-20d}", i);
	}
}
//- is give the whitespace in the right side