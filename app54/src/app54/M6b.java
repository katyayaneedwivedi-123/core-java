package app54;

public class M6b {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println("try begin");
			int i = Integer.parseInt("abc");
			System.out.println("try end");
		}
		catch(NumberFormatException ex) {
			System.out.println(ex);
		}
		System.out.println(2);
	}
}
