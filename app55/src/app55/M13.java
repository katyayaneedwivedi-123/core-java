package app55;

public class M13 {
	static void t1(C c1) {
		c1.test1();
		c1.test2();
	}
	
	public static void main(String[] args) {
//		t1(new C());
		t1(new C() {
			void test1() {
				System.out.println("C-test1");
			}
		});
		
	}
}
