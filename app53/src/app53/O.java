package app53;

public class O {
	public static void main(String[] args) {
		byte b1 = 10;
		double d1 = test1(b1);//double d1 = test1(Byte.valueOf(b1)).doubleValue();
		//in this 2 auto operation
		System.out.println("done");
	}
	static Double test1(Byte b1) {
		return test2(b1);//return Double.vlaueOf(test2(b1.byteValue()));
	}
	static double test2(byte b1) {
		return b1;
	}
}
