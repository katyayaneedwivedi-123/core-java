package app54;

public class M45 {
	public static void main(String[] args) {
		System.out.println("main begin");
		try {
			System.out.println("try begin");
			int i = 10 / 0;
			System.out.println("try end");
		}
		catch(ArithmeticException ex) {
			System.err.println(ex.getMessage());
		}
		System.out.println("main end");
	}
}
//we can develop the System.err.println(ex.getMessage()) is give the red color of an exception