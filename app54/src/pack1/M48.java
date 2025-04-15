package pack1;

public class M48 {
	public static void main(String[] args) {
		try {
			System.out.println("try started");
			double i = 10 / 0.0;
			System.out.println("try end");
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		System.out.println(2436553);
	}
}
