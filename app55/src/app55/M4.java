package app55;

class Test{
	class A{
		
	}
	
	static class B{
		
	}
}
public class M4 {
	public static void main(String[] args) {
		Test.A a1;
		Test.B b1;
		
		Test t1 = new Test();
		a1 = t1.new A();
		a1 = new Test().new A();
		
		b1 = new Test.B();
	}
}
//if the data type uses then outer.inner
// A and B is inner class to Test we use the inner class inside inner class
//for the data type uses
//static member of one class we can used in another class
//we are not creating object to Test we create to B Test is refer to B