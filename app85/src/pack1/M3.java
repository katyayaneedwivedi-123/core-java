package pack1;
interface D {
	void test1();
}
class E {
	void m1() {
		System.out.println("from m1");
	}
}
public class M3 {
	public static void main(String[] args) {
		E e1 = new E();
		D d1 = e1 :: m1;
		d1.test1();
	}
}
//for the non static method for an object method assigning to test method 
//means for unimplemented we can use the class name :: (static method name)