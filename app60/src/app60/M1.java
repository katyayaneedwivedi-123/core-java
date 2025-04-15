package app60;
class A {
	
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();//object is created and assign to a1
		A a2 = a1;
		a1 = null;
		a2 = null;
		//object is became abandoned
	}
}
