package app54;

public class M42 {
	public static void main(String[] args) {
		System.out.println("main begin");
		try {
			System.out.println("try begin");
			int i = 10 / 0;
			System.out.println("try end");
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("main end");
	}
}
//ex.getMessage() this the only reason for getting the exception
//reason is one of the way of getting the exception