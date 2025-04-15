package pack2;

public class K23 {
	public static void main(String[] args) {
		try {
			Integer obj = null;
			int i = obj;
			System.out.println(obj);
			System.out.println(i);
		}
		catch(NullPointerException ex) {
			ex.printStackTrace();
		}
	}
}
