package app54;

public class M58 {
	int test() {
		try {
			return 1;
		}
		catch(ArithmeticException e) {
			return 2;
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			return 2;
		}
		catch(StackOverflowError e2) {
			return 2;
		}
		finally {
			return 45;
		}
	}
}
