package app54;

public class M12 {
	public static void main(String[] args) {
		int[] j = {34, 23, 56, 65, 23};
		String s1 = "rasfgsd";
		Object o1 = new Object();
		try {
			int i = 45 / 0;
			try {
				System.out.println("try");
				int k = j[5];
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			try {
				System.out.println("try2");
				System.out.println(s1.length());
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			try {
				System.out.println("try3");
				String s2 = (String) o1;
			}
			catch(ClassCastException e) {
				System.out.println(e);
			}
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		System.out.println(8654);
	}
}
