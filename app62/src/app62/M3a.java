package app62;
class C1 {
	int i;
	int j;
	void test1(int i, int j) {
		System.out.println("test");
	}
	static {
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
}
public class M3a {
	public static void main(String[] args) throws ClassNotFoundException{
		C1 c = new C1();
		c.test1(23, 56);
		Class c1 = Class.forName("app62.C1");
		System.out.println(23423);
	}
}
