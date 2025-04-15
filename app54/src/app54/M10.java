package app54;

public class M10 {
	public static void main(String[] args) {
		System.out.println(1);
		int[] elements = {20, 34, 67};
		String s1 = null;
		String s2 = "Katyayanee";
		Object o1 = new Object();
		try {
			System.out.println("try begin");
			int i = 80 / 0;
			int j = elements[3];
			System.out.println(s1.length());
			System.out.println(s1.charAt(10));
			String s3 = (String) o1;
			int k = Integer.parseInt("aedsyguf");
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
			System.out.println(48);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
			System.out.println(1);
		}
		catch(NullPointerException ex) {
			System.out.println(ex);
			System.out.println(2);
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println(ex);
			System.out.println(3);
		}
		catch(ClassCastException ex) {
			System.out.println(ex);
			System.out.println(4);
		}
		catch(NumberFormatException ex) {
			System.out.println(ex);
			System.out.println(5);
		}
		System.out.println(9);
	}
}
