package pack2;

public class K4 {
	public static void main(String[] args) {
		K4 k = new K4();
		test1();
	}
	static void test1() {
		System.out.println("test1 is");
		test2();
		System.out.println("test1 end");
	}
	static int test2() {
		System.out.println("test2 start");
		try {
			System.out.println("started try");
			Class.forName("K4");
			System.out.println("end try");
		}
		catch(ClassNotFoundException ex) {
			System.out.println("catch start");
			System.out.println(ex);
			System.out.println("catch end");
		}
		finally {
			System.out.println("finally is here");
			return 45;
		}
	//	System.out.println("wrong");//this is a unreachable statements
	}
}

