package app54;

public class M19 {
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
		catch(ArithmeticException ex) {
			//AE specific any information
			System.out.println("AE" + ex);
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println(5);
	}
}
//if we not give any type exception catch the value is check then terminate even though finally is executing 
//no matter rising exception block is handling or not but the exception block is executing
//finally block it should be a last block
//finally block is guaranteed to execute if control enter inside a try no matter what should happens inside the try
//if something happens before try then finally block is not executing