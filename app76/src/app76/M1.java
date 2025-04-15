package app76;

public class M1 {
	public static void main(String[] args) {
		String s1 = "abc";
		System.out.println(s1);
		String s2 = new String();
		s2 = "abc";
		System.out.println(s2);
		String s3 = new String("abc");
		System.out.println(s3);
		char[] chars = {'a', 'b', 'c'};
		String s4 = new String(chars);
		System.out.println(s4);
	}
}
//these different way we assign value or choose