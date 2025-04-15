package app58;
class A {//non generic  type of class
	String s1;
}

public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.s1 = "abc";
		
		A a2 = new A();
		a2.s1 = "xyz";
		
		A a3 = new A();
		a3.s1 = "hello";
		
		A a4 = new A();
		a4.s1 = "test";
		
		System.out.println("done");
		
	}
}
//every object is pointing to the data type string
//s1 data type is hardcoded is string
//all object data type is same means fixed
