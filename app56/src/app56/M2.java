package app56;
interface B {
	void test(int i, int j);
}
public class M2 {

	public static void main(String[] args) {
		B b1 = (int i, int j) -> System.out.println("test" + i + ", " + j);
		b1.test(10, 20);
		System.out.println("------------");
		
		B b2 = (x, y) -> {
			System.out.println("test" + x + ", " + y);
			System.out.println("test" + x + ", " + y);
			System.out.println("test" + x + ", " + y);
			System.out.println("test" + x + ", " + y);
		};
		b2.test(100, 200);
		System.out.println("------------");
		
		B b3 = (x, y) -> {
			System.out.println("test" + x + ", " + y);
			System.out.println("test" + x + ", " + y);
			System.out.println("test" + x + ", " + y);
			System.out.println("test" + x + ", " + y);
		};
		b3.test(100, 200);
		System.out.println("------------");
		
	}
	
}
