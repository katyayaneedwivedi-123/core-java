package pack1;

public class M21 {
	public static void main(String[] args) {
		try {
			Class.forName("");
		}
		catch (Throwable ex) {
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//can be upcasted to throwable
//running successful