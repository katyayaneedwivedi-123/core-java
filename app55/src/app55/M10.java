package app55;
abstract class C {
	abstract void test1();
	void test2() {
		System.out.println("C-test2");
	}
}
public class M10 {
	public static void main(String[] args) {
		//C c1 = new C();//we can not create an object to C b/c abstract not create an object
//		C c2 = new C() {
//		
//		};//in anonymous inner class overriding is important
		
		C c3 = new C() {
			void test1() {
				System.out.println("AIC-test1");
			}
		};//it is concrete b/c it override the test method
		c3.test1();
		c3.test2();
	}
}

//anonymous inner class can not be abstract b/c anonymous inner class create itself object but 
//abstract class can not create an object
//anonymous inner class always should be concrete 