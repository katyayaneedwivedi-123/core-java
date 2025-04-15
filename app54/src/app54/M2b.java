package app54;

public class M2b {
	public static void main(String[] args) {
		System.out.println(1);
		int[] elements = {10, 20};
		try {
				System.out.println("try begin");
				int i = elements[2];
				System.out.println("try end");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
					System.out.println(ex);
		}
		System.out.println(2);
	}
}
