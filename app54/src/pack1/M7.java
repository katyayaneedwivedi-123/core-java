package pack1;

public class M7 {
	public static void main(String[] args) {
		System.out.println(1);
		test1();
		System.out.println(2);
	}
	static void test1() {
		System.out.println(3);
		test2();//exception is ducking
		System.out.println(4);
	}
	static void test2() {
		System.out.println(5);
		int i = 10 / 0;//exception occurred
		System.out.println(6);
	}
}
//output is - 1 3 5 exception
//b/c the main method is calling to the test1 method and 
//and test1 method is calling to the test2 method in test2 
