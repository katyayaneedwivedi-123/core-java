package pack2;

public class K2 {
	public static void main(String[] args) {
		String s1 = null;
		try {
			int a = 67 / 0;
			int i = Integer.parseInt("765");
			System.out.println(s1.length());
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		catch(Throwable e) {
			System.out.println(9878);
		}
		System.out.println(89);
	}
}
