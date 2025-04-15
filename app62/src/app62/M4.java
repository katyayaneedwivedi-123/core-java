package app62;

class D {
	void test() {
		System.out.println("test");
	}
}
public class M4 {
	public static void main(String[] args) throws Exception{
		Class c1 = Class.forName("app62.D");
		D d1 = (D) c1.newInstance();//it create an object without the use of the operator
		d1.test();
	}
}
//it give the output is test
//newInstance() method is duplicate but we are still used
//b/c without the new operator it able to create an object of the class at the runtime