package app54;

public class M44 {
	public static void main(String[] args) {
		System.out.println("main begin");
		try {
			System.out.println("try begin");
			int i = 10 / 0;
			System.out.println("try end");
		}
		catch(ArithmeticException ex) {
			System.err.println(ex);
		}
		System.out.println("main end");
	}
}
