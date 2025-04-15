package app55;

interface D{
	void test1();
	void test2();
}

public class M11 {
	public static void main(String[] args) {
		D d1 = new D() {
			public void test1() {
				System.out.println("A-test1");
			}
			public void test2() {
				System.out.println("A-test2");
			}
		};
		d1.test1();
		d1.test2();
	}
}
