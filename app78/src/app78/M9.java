package app78;

public class M9 {
	public static void main(String[] args) {
		int i = 22;
		String s1 = String.format("[%d]", i);//if we mention 01 then it required minimum
		System.out.println(s1);
		String s2 = String.format("[%05d]", i);
		System.out.println(s2);
		String s3 = String.format("[%015d]", i);
		System.out.println(s3);
		System.out.printf("{%d}\n", i);
		System.out.printf("{%020d}", i);
	}
}
//if we add 0 without the number it give the MissingFormatWidthException