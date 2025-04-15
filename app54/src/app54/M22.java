package app54;

public class M22 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			int i = 10 / 0;
		}
		catch(ArithmeticException ex) {
			System.out.println(3);
			int i = 10 / 0;
		}
		finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
//flow is terminating after the finally block b/c inside the catch body exception is occurred so finally is print b/c after the finally the flow is occurred
// the output is
//1
//2
//3
//4
//exception