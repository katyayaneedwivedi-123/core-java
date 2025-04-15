package app54;

public class M5 {
	public static void main(String[] args) {
		System.out.println(1);
		Object o1 = new Object();//class cast exception
		String s1 = (String) o1;
		System.out.println(2);
	}
}
