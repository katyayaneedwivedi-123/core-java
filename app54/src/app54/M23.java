package app54;

public class M23 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			return;
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
//once the control enter the try then finally is execute nomatter the return statement is executed or not
// the output is 
//1
//2
//3
//4
//5 is not executed b/c the return in the try