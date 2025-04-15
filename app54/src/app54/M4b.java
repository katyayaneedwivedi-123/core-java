package app54;

public class M4b {
	public static void main(String[] args) {
		System.out.println(1);
		String s1 = "abc";
		try {
			System.out.println("try begin");
			System.out.println(s1.charAt(5));
			System.out.println("try end");
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
		System.out.println(2);
	}
}
