package app54;

public class M8a {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			main(null);
		}
		catch(StackOverflowError obj) {
			System.out.println(obj);
		}
		System.out.println(2);
	}
}
