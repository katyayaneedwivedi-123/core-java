package app58;

class B
{
	void test(Integer i) {
		
	}
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.test(100);
		
		B b2 = new B();
		b2.test(300);
		
		B b3 = new B();
		b3.test(200);
		
		System.out.println("done");
		
	}
}
//in this the test method argument data type is fixed not changing one object to another
//any object of B the test method is integer
//non static test method argument data type is fixed not changing one object to another object so class B is also a non generic class
