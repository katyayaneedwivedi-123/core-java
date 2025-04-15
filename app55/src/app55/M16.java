package app55;

public class M16 {
	static C t1() {
		return new C() {
			void test1() {
				System.out.println("C-test1");
			}
		};
	}
	
	static D t2() {
		return new D() {
			public void test1() {
				System.out.println("D-test1");
			}
			public void test2() {
				System.out.println("D-test2");
			}
		};
	}
	
	public static void main(String[] args) {
		C obj1 = t1();
		obj1.test1();
		obj1.test2();
		
		D obj2 = t2();
		obj2.test1();
		obj2.test2();
		
	}
	
}
