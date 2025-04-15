package app53;

public class N {
	public static void main(String[] args) {
		double d1 = test();//Double d1 = test().doubleValue();//unboxing
		System.out.println(d1);
	}
	static Double test() {
		return 2.3;//return Double.vlaueOf(2.3)//boxing;
	}
}
