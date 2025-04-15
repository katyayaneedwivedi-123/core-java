package app55;

public class M7a {
	public static void main(String[] args) {
		int k = 89;
		final int b = 23;
		class A2{
			int i = 34;
			int j = 67;
			void test() {
				System.out.println("test");
				System.out.println("i = " + i + " j = " + j);
			}
		}
		A2 a = new A2();
		a.test();
		System.out.println("done");
		k = 90;
		System.out.println("k = " + k + " b = " + b);
	}
}
