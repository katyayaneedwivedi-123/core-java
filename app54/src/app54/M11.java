package app54;

public class M11 {
	public static void main(String[] args) {
		System.out.println(1);
		int[] i = {45, 54, 66, 34};
		String s1 = null;
		String s2 = "sdghwefg";
		try {
			int j = i[4];
			System.out.println(s1.length());
			System.out.println(s2.charAt(8));
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
		catch(NullPointerException ex) {
			System.out.println(ex);
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
	}
}
