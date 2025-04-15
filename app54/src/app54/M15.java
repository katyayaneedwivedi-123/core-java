package app54;

public class M15 {
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
		catch(NumberFormatException | 
				ArrayIndexOutOfBoundsException | ArithmeticException ab) {
			//generic information to AE, AIOB, NFE
			System.out.println("AE or AIOBE oe NFE :" + ab);
		}//this is a multi exceptions catch this is introduced in jdk 1.7 or jdk 7
		System.out.println(5);
	}
}
//generic massage to catch for multiple specify exception
//it used for multi some specific exception