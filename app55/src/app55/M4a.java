package app55;
class Test1{
	class A1{
		static {
			System.out.println("SIB is here");
		}
		{
			System.out.println("IIB");
		}
	}
	static class B1{
		{
			System.out.println("IIB2 is here");
		}
		static void test2() {
			System.out.println("test");
		}
	}
}
public class M4a {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1.A1 a;
		Test1.B1 b;
		a = t1.new A1();
		b = new Test1.B1();
		Test1.B1.test2();
		System.out.println("done");
	}
}
