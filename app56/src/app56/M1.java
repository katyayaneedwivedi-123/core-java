package app56;
	
interface A {
	void test();
}


public class M1 {
	public static void main(String[] args) {
		A a1 = new A() {
			public void test() {
				System.out.println("A-test");
			}
		};
		a1.test();
		
		System.out.println("--------------------");
		
		A a2 = () -> System.out.println("Lambda-exp-test");
		a2.test();
		
		System.out.println("------------");
		A a3 = () -> {
			System.out.println("lambda-exp-test-stmt1");
			System.out.println("lambda-exp-test-stmt2");
			System.out.println("lambda-exp-test-stmt3");
		};
		a3.test();
	}
}
//method name is doesn't require 
//single statement {} are not require 
//multiple statement {} are require
//only for single method interface directly a implementation
//single method interface anonymous way is not need the best way is lambda expression