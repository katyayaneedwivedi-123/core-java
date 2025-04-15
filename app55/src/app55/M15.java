package app55;

public class M15 {
	static A t1() {
		return new A();
	}
	
	static A t2() {
		return new A() {
			void test1() {
				System.out.println("AIC-test1");
			}
		};
	}
	
	static A t3() {
		return new A() {
			void test2() {
				System.out.println("AIC-test2");
			}
		};
	}	
	
	static A t4() {
		return new A() {
			void test1() {
				System.out.println("AIC-test1");
			}
			void test2() {
				System.out.println("AIC-test2");
			}
		};
	}	
	
	public static void main(String[] args) {
		A obj1 = t1();
		obj1.test1();
		obj1.test2();
		System.out.println("---------------");
		
		A obj2 = t2();
		obj2.test1();
		obj2.test2();
		System.out.println("---------------");
		
		A obj3 = t3();
		obj3.test1();
		obj3.test2();
		System.out.println("---------------");
		
		A obj4 = t4();
		obj4.test1();
		obj4.test2();
		System.out.println("---------------");
		
	}
}
