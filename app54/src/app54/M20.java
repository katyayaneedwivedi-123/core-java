package app54;

public class M20 {
	public static void main(String[] args) {
		System.out.println(1);
		int i = 10 / 0;
		try {
			System.out.println(2);
		}
		catch(ArithmeticException ex) {
			System.out.println(3);
		}
		finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
//in this exception is happens before the try then finally block is not executed
//it give 1 and exception b/c exception is occure before try so finally is not executing 