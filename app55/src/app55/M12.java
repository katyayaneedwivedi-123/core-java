package app55;

public class M12 {
	static void m1(A a1) {
		a1.test1();
		a1.test2();
	}
	
	public static void main(String[] args) {
		m1(new A());
		System.out.println("----------");
		m1(new A() {
			void test1() {
				System.out.println("AIC-test1");
			}
		});
		System.out.println("-------------");
		
		m1(new A() {
			void test2() {
				System.out.println("AIC-test2");
			}
		});
		System.out.println("-------------");
		
		m1(new A() {
			void test1() {
				System.out.println("AIC-test1");
			}
			void test2() {
				System.out.println("AIC-test2");
			}
		});
		System.out.println("-------------");
	}
}
