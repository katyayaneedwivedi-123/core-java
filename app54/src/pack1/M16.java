package pack1;

public class M16 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			test1();
		}
		catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println(2);
	}
	public static void test1() throws ClassNotFoundException {
		System.out.println(3);
		Class.forName("");
		System.out.println(4);
	}
}
//it compile successfully 
//exception handling the calling of the method
//test1() have a try catch and calling statement getting the throws