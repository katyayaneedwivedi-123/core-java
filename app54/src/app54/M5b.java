package app54;

public class M5b {
	public static void main(String[] args) {
		System.out.println(1);
		Object o1 = new Object();
		try {
			System.out.println("try begin");
			String s1 = (String) o1;
			System.out.println("try end");
		}
		catch(ClassCastException ex) {
			System.out.println(ex);
		}
		System.out.println(2);
	}
}
