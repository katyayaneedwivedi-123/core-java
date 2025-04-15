package app53;

public class Q {
	public static void main(String[] args) {
		test();
		test(30);
		test(40, 50);
		test(60, 100, 30);
		test(20, 100, 300, 2);
		test(50, 20, 1, 3, 45, 500);
	}
	static void test(int ... args) {
		for(int i :	args) {
			System.out.println(i);
		}
		System.out.println("-----------------");
	}
}
