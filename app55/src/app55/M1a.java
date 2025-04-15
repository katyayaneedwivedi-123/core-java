package app55;

public class M1a {
	private class A {
		int i = 1;
		int j = 3;
		int test(int i, int j) {
			System.out.println("test start");
			for(int a = 1; a <= 10; a++) {
				System.out.println(a);
			}
			System.out.println("test end");
			return 23;
		}
	}
	static class B {
		int  b = 2;
		int c = 4;
		void test() {
			System.out.println("test");
			System.out.println(b);
			System.out.println(c);
			System.out.println("end");
		}
	}
	public static void main(String[] args) {
		System.out.println("main is here");
		A a1;
		M1a m = new M1a();
		a1 = m.new A();
		a1.test(45, 67);
		B b = new B();
		b.test();
		System.out.println("main is end");
	}
}
