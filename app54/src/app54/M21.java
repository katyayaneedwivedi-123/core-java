package app54;

public class M21 {
	public static void main(String[] args) {
		System.out.println(1);
		if(true) {
			return;
		}
		int i = 10 / 0;
		try {
			System.out.println(2);
		}
		catch(ArithmeticException ex) {
			System.out.println(3);
		}
		finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
//before try if block give return then finally block is not executing 
//the output is 1 not any exception