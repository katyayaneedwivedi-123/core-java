package app54;

public class M49 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			int i = 10 / 0;
			System.out.println(2);
		}
		catch(ArithmeticException ex1) {
			System.out.println(3);
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
//in the catch body have occurred abnormal condition then the this catch is not handle this so it develop the new try and catch inside the body