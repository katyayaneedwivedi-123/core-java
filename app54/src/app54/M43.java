package app54;

public class M43 {
	public static void main(String[] args) {
		System.out.println("main begin");
		try {
			System.out.println("try begin");
			int i = 10 / 0;
			System.out.println("try end");
		}
		catch(ArithmeticException ex) {
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
//catch body always call the ex.printStackTrack(); is one of the reason to handle the exception