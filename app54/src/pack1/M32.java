package pack1;

public class M32 {
	public static void main(String[] args) {
		try {
			Class.forName("");
			Thread.sleep(10000);
		} 
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
//order is not matter