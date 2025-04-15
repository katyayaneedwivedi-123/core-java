package app54;

public class M7b {
	public static void main(String[] args) {
		System.out.println(1);
		StringBuffer[] array = new StringBuffer[99999999];
		try {
			System.out.println("try begin");
		for(int i = 0; i < array.length; i++) {
			array[i] = new StringBuffer("abc");
		}
		System.out.println("try end");
		}
		catch(OutOfMemoryError ex) {
			System.out.println(ex);
		}
		System.out.println(2);
	}
}
