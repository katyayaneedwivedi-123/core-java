package app53;

public class F {
	public static void main(String[] args) {
		int i = test();//int i = test().intValue();
		System.out.println("done");
	}
	static Integer test() {
		Integer obj = Integer.valueOf(100);
		return obj;
	}
}
