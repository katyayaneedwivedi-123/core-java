package app54;

public class M1e {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println("try begin");
			int i = 10 / 0;
			System.out.println("try end");
		}
		catch(ArithmeticException ex) {
			System.out.println(55);
			int i = 1 / 0;//exception is rises here so it can not be handled bye the same catch
			//it terminate the flow so we are not getting 66
			System.out.println(66);
		}
		System.out.println(2);
	}
}
