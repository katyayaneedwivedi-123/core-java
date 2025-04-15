package app54;

public class M31 {
	public static void main(String[] args) {
		try {
			
		}
		catch(ArithmeticException ex) {
			System.out.println("abc");
		}
//		catch(ArithmeticException ex1) {
//			System.out.println("xyz");
//			System.out.println("xyz");
//			System.out.println("xyz");
//		}
		System.out.println(1);
	}
}
//it give compile time error b/c both the catches are the same purpose for arithmetic exception
//even though the 2 differences are there one the ex and the statements
//multiple catches are allow but the every catch have the unique exception class