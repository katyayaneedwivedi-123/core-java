package app78;

public class M8 {
	public static void main(String[] args) {
		int i = 22;
		String s1 = String.format("[%d]", i);
		System.out.println(s1);
		String s2 = String.format("[%5d]", i);
		System.out.println(s2);
		String s3 = String.format("[%15d]", i);
		System.out.println(s3);
		System.out.printf("{%d}\n", i);
		System.out.printf("{%20d}", i);
	}
}
//String.format we use this ("[]") brackets and System.out.pritnf ("{}") brackets for mentioning something
//printf method is don't provide a new line by default so we use \n
//if it is just number it says like a width