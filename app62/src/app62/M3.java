package app62;

class C {
	static {
		System.out.println("C-SIB");
	}
	static void test() {
		System.out.println("C-test");
	}
}
public class M3 {
	public static void main(String[] args) {
		C.test();
		System.out.println("------------");
		try {
			Class c1 = Class.forName("app62.C");
			System.out.println(c1);
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
//Class c1 = Class.forName("app62"); class is already loaded then it not loaded
//it return the class information and print the SIB also