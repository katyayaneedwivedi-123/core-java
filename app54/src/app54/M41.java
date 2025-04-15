package app54;

public class M41 {
	public static void main(String[] args) {
		System.out.println("main begin");
		try {
			System.out.println("try begin");
			int i = 10 / 10;
			System.out.println("try end");
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		System.out.println("main end");
	}
}
//b/c of we getting the exception is 0
//while handling exception object we getting 2 things
//1 is exception class name 
//2 is reason