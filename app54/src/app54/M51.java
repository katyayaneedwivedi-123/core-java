package app54;

public class M51 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			int i = 10 / 0;
			System.out.println(2);
			//several statements
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		System.out.println("end");
	}
}
