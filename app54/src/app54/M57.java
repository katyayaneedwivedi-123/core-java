package app54;

public class M57 {
	boolean test() {
		try {
			//several statements
		}
		catch(ArithmeticException e) {
			return true;
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			return false;
		}
		catch(NullPointerException e2) {
			return true;
		}
		return false;
		}
}
