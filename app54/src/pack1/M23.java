package pack1;

public class M23 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
		test1();
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println(2);
	}
	public static void test1() throws InterruptedException{
		System.out.println(3);
		Thread.sleep(20);
		System.out.println(4);
	}
}
