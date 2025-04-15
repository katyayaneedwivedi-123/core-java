package pack1;

public class M8 {
	public static void main(String[] args) {
		System.out.println(1);
		test1();
		System.out.println(2);
	}
	static void test1() {
		System.out.println(3);
		try {
		test2();
		}
		catch(ArithmeticException ex) {
			ex.printStackTrace();
		}
		System.out.println(4);
	}
	static void test2() {
		System.out.println(5);
		int i = 10 / 0;//exception occurred
		System.out.println(6);
	}
}
//when exception is rising in the line number 21
//but we handle the exception in line number 11 through the calling  of the method