package app54;

public class M26 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			int i = 10 / 0;
		}
		catch(ArithmeticException ex) {
			System.out.println(3);
			System.exit(0);
		}
		finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
//finally block is not executing b/c System.exit(0); is come inside the catch
//1 2 3 is output