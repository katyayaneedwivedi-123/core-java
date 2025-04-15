package pack1;

public class M10 {
	public static void main(String[] args) {
		try {
			Class.forName("pack1.M10");//in this we are used the current class name 
		} 
		catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//it compile
//it is also a checked exception
//it need try catch