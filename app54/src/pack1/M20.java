package pack1;

public class M20 {
	public static void main(String[] args) {
		try {
			Class.forName("");
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//compilation and running both are very successful
//in place of ClassNotFoundException we use Exception it is a upcasting 