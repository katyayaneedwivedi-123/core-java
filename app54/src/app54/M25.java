package app54;

public class M25 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.exit(0);
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
// the output is 
//1
//2
//even though the control is goes to the try but if System.exit(0); is here then finally is not executing