package pack2;

public class M2 {
	public static void main(String[] args) {
		try(A a1 = new A();
			A a2 = new A();
			A a3 = new A()) {
			System.out.println("try");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("done");
	}
}
//in try catch only closeable type resources can be initialized in the try we can initialized in the try
//we can initialized any no of closable resources in try 