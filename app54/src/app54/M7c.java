package app54;

public class M7c {
	public static void main(String[] args) {
		System.out.println(1);
		
		try {
			StringBuffer[] array = new StringBuffer[999999999];//this line give an exception so 22 is not printing
			System.out.println(22);
			for(int i = 0; i < array.length; i++) {
				array[i] = new StringBuffer("abc");
			}
		}
		catch(OutOfMemoryError ex) {
			System.out.println(ex);
		}
		System.out.println(2);
	}
}
