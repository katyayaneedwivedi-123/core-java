package pack1;

public class M31 {
	public static void main(String[] args) {
		try {
			Class.forName("");
			Thread.sleep(10000);
		} 
		catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
//order of catches not depending on order of try
//try have the 2 checked statements so it have the catches
//but catches are depend on the statement of try