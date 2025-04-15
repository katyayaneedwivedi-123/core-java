package app54;

public class M8b {
	public static void main(String[] args) {
		try {
			System.out.println("try begin");
			main(null);
			System.out.println("try end");
		}
		catch(StackOverflowError ex) {
			System.out.println(ex);
		}
	}
}
