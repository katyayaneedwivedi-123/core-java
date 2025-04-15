package app54;

public class M1g {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println("try begin");
			int i = 10;
			System.out.println("try end");
		}
		catch(ArithmeticException ex) {
			System.out.println(55);
			System.out.println(66);
			//System.out.println(i);
		}
		System.out.println(2);
		//System.out.println(i);
	}
}
//local member of try can not be used outside of try it give compilation error