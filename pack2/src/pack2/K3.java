package pack2;

public class K3 {
	public static void main(String[] args) {
		K3 k = new K3();
		test();
	}
		static void test()
		{
			try {
				System.out.println("started");
				try {
					int i = 28 / 0;
				}
				catch(ArithmeticException ex) {
					System.out.println(ex);
					System.out.println("for first catch");
				}
				finally {
					System.out.println("finally is here");
				}
				int[] a  = {23, 44, 78};
				int b = a[3];
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("catch");
				System.out.println(e);
				System.out.println("catch end");
			}
			System.out.println("i am very sad");
		}
	}
