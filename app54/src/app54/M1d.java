package app54;

public class M1d {
	public static void main(String[] args) {
		System.out.println(1);
		int i = 10 / 0;
		try {
			System.out.println("try begin");
			System.out.println("try end");
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		System.out.println(2);
	}
}
//catch is responsible for developing abnormal condition inside the try body
//exception is inside the try body so it not handle is give exception