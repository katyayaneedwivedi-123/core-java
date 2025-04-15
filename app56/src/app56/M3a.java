package app56;
interface D {
	int test(int i, int j, int k);
}
interface E {
	void test1(int a, int b);
}
public class M3a {
	public static void main(String[] args) {
		D d1 = (int i, int j, int k) -> {System.out.println("test");
		return 1;
		};
		d1.test(12, 23, 43);
		System.out.println("--------");
		D d2 = (i, j, k) -> i + j + k ;{
			System.out.println(d2.test(34, 56, 67));
		};
		System.out.println("---------");
		D d3 = (i, j, k) -> {
			System.out.println("this is final");
			return i + j - k;
		};
		System.out.println(d3.test(23, 89, 45));
		
		System.out.println("----------");
		
		E e1 = (int a, int b) -> System.out.println("start new");
		e1.test1(45, 67);
		
		E e2 = (a, b) -> 
		{
			System.out.println("test1" + a + b);
		};
		e2.test1(34, 56);
		System.out.println("------------");
		
		E e3 = (a, b) -> 
		{
			System.out.println("test1" + a + b);
			System.out.println(a + "test" + b);
			System.out.println(a + b + "test");
		};
		e2.test1(12, 50);
		System.out.println("------------");
	}
}
