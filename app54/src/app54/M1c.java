package app54;

public class M1c {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println("try begin");
			int i = 10;
			System.out.println("try end");
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		System.out.println(2);
	}
}
//when all code is executed means exception is not occur then
//catch is not executed