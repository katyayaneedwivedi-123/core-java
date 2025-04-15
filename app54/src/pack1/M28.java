package pack1;

public class M28 {
	public static void main(String[] args) throws Throwable{
		System.out.println(1);
		test1();
		System.out.println(34);
	}
	 static void test1() {
		System.out.println(23);
		try {
		Thread.sleep(35);
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println(56);
	}
}
//Thread.sleep or join or wait means it take some time according to the give value then it executed