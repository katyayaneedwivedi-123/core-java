package pack1;

public class M24 {
	public static void main(String[] args) {
		System.out.println(1);
		test1();
		System.out.println(2);
	}
	public static void test1() {
		System.out.println(3);
		try {
		Thread.sleep(20);
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println(4);
	}
}
