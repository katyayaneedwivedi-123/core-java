package pack1;

public class M25 {
	public static void main(String[] args) throws InterruptedException{
		System.out.println(1);
		test1();
		System.out.println(2);
	}
	static void test1() throws InterruptedException{
		System.out.println(3);
		Thread.sleep(23);
		System.out.println(4);
	}
}
