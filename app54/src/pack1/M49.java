package pack1;

public class M49 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			int i = 0 / 89;
			System.out.println(2);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		finally {
			System.out.println("finally is here");
		}
	}
}
