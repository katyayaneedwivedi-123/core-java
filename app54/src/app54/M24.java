package app54;

public class M24 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			int i = 10 / 0;
		}
		catch(ArithmeticException ex) {
			System.out.println(3);
			return;
		}
		finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
//even though the control is going to the catch but the finally is executing
//but the sop(5) is not executing b/c the exception is occurred in the try then control is goes to the catch