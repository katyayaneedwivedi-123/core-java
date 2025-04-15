package app54;

public class M56 {
	public static void main(String[] args) {
		boolean b1 = true;
		M56 m = new M56();
		System.out.println(m.test1());
	}
		boolean test1() {
			try {
				System.out.println(1);
				int i = 10 / 0;
			}
			catch(ArithmeticException ex) {
				System.out.println(2);
				return true;
			}
			finally {
				System.out.println("finally come");
			}
			return true;
		}
}

