package app54;

public class M50 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			int i = 10 / 0;
			System.out.println(2);
		}
		catch(ArithmeticException ex1) {
			System.out.println(3);
		}
		finally {System.out.println("from finally");
			try {
				System.out.println(4);
				int j = 10 / 0;
				System.out.println(5);
			}
			catch(ArithmeticException ex2) {
				System.out.println(6);
			}
			System.out.println(7);
		}
		System.out.println(8);
	}
}
