package app63;

public class M2 {
	public static void main(String[] args) {
		for(int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
		test();
		for(int i = 5000; i <= 6000; i++) {
			System.out.println(i);
		}
	}
	static void test() {
		for(int i = 15000; i <= 16000; i++) {
			System.out.println(i);
		}
	}
}
//even though the output is from the 3 different method but we are not getting to parallelly we are getting sequential output