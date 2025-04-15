package app54;

public class M1f {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println("try begin");
			int i = Integer.parseInt("anc");
			System.out.println("try end");
		}
		catch(ArithmeticException ex) {
			System.out.println(55);
			System.out.println(66);
		}
		System.out.println(2);
	}
}
//in number format catch is not handle this so it terminate the flow