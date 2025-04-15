package app55;

public class M2a {
	int test1() {
		System.out.println("test1");
		return 50;
	}
	static void test2() {
		System.out.println("static test2");
	}
	public static void main(String[] args) {
		M2a a = new M2a();
		a.test1();//this 
	//	new M2a().test1();//and this also
		test2();
		System.out.println("done");
	}
}
//we use the both method for the non static method use in outside of the method body