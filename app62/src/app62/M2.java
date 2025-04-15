package app62;
class B {
	static {
		System.out.println("B-SIB");
	}
}
public class M2 {
	public static void main(String[] args) {
		try {
			Class c1 = Class.forName("app62.B");
			System.out.println(c1);
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
//Class c1 = Class.forName("app62.B");is loading a memory if the class is not loading a memory if class already loaded a memory then it not loaded
//b/c class loaded a memory only one time