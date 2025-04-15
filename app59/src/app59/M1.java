package app59;
class A {
	int i;
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 100;
		
		System.out.println(a1);
		
		A a2 = new A();
		a2.i = 200;
		
		System.out.println(a2);
		
		String s1 = "hello:" + a1;
		System.out.println(s1);
	}
}
