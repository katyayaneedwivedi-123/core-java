package app54;

public class M14 {
	public static void main(String[] args) {
		if(args.length == 0) {
			return;
		}
		String s1 = args[0];
		String s2 = new String();
		try {
			System.out.println(1);
			int i = Integer.parseInt(s1);
			System.out.println(2);
			int[] array = {10, 20, 30, 40};
			int k = array[i];
			System.out.println(3);
			int m = 1 / (3 - i);
			System.out.println(4);
		}
		catch(NumberFormatException ab) {
			//As specific any information
			System.out.println("NFE" + ab);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			//AE specific any information
			System.out.println("AIOBE" + ex);
		}
		catch(ArithmeticException ex) {
			//AE specific any information
			System.out.println("AE" + ex);
		}
		System.out.println(5);
	}
}
//it used for the specific exception