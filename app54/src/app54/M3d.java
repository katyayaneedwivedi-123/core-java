package app54;

public class M3d {
	public static void main(String[] args) {
		System.out.println(1);
			String s1 = null;
		try {
				System.out.println("try begin");
				System.out.println(s1.length());//abnormal
				System.out.println("try end");
			}
		catch(NullPointerException ex) {
			System.out.println(ex);
		}
		System.out.println(2);
	}
}
