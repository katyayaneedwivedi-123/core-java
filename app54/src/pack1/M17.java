package pack1;

public class M17 {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(1);
			test1();
		System.out.println(2);
	}
	public static void test1() throws ClassNotFoundException {
		System.out.println(3);
		Class.forName("");
		System.out.println(4);
	}
}
//we want to handle the exception without the use of try and catch then we use the throws in the both method