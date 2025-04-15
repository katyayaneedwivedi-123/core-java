package app54;

public class M9 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			int i = 10 / 0;
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		System.out.println(2);
	}
}
