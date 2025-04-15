package app53;

public class V {
//	static void test(byte arg) {
//		System.out.println(1);
//	}
		
//	static void test(Byte arg) {
//		System.out.println(2);
//	}
	
//	static void test(int arg) {
//		System.out.println(3);
//	}
	
	static void test(Integer arg) {
		System.out.println(4);
	}
	
//	static void test(Number arg) {
//		System.out.println(5);
//	}
	
//	static void test(Object arg) {
//		System.out.println(6);
//	}
	
	static void test(byte ... arg) {
		System.out.println(7);
	}
	
	public static void main(String[] args) {
		byte b1 = 10;
		test(b1);
	}
	
}
//first preference goes to widening
//then second goes to boxing
//then third upcasting and object