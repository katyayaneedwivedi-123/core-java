package app54;

public class M7 {
	public static void main(String[] args) {
		System.out.println(1);
		StringBuffer[] array = new StringBuffer[99999999];
		for(int i = 0; i < array.length; i++) {
			array[i] = new StringBuffer("abc");
		}
		System.out.println(2);
	}
}
//out of memory error
//heap memory is not sufficient while run the program create 10cr object