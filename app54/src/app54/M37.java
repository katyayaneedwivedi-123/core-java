package app54;

public class M37 {
	public static void main(String[] args) {
		try {
			int i = 10 / 0;
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("done");
	}
}
