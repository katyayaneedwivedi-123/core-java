package app54;

public class M1i {
	public static void main(String[] args) {
		System.out.println(1);
		int j = 10;
		try {
			System.out.println("try begin");
			System.out.println("try end:" + j);
		}
		catch(ArithmeticException ex) {
			System.out.println(55);
			System.out.println(66);
			System.out.println(j);
		}
		System.out.println(2);
		System.out.println(j);
	}
}
