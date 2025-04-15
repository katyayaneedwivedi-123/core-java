package pack1;

public class M9 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
		test1();
		}
		catch(ArithmeticException ex) {
			ex.printStackTrace();
		}
		System.out.println(2);
	}
	static void test1() {
		System.out.println(3);
		test2();
		System.out.println(4);
	}
	static void test2() {
		System.out.println(5);
		int i = 10 / 0;//exception occurred
		System.out.println(6);
	}
}
//we are getting 1 3 5 exception 2 we are not getting
//the 4 b/c we handle the exception in the main method not in the 
//test1 method so we are not getting the 4