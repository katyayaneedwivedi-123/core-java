package pack1;

public class M33 {
	public static void main(String[] args) {
		try {
			Thread.sleep(10000);
			Class.forName("");
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
//if we have the multiple statement in the try the we use only the Exception in the catches