package app54;

public class M16 {
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
		catch(Exception ex) {
			//generic information to AE, AIOB, NFE
			System.out.println("exception :" + ex);
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println(5);
	}
}
//we use catch(exception ex) for all exception not for some exception
//it is used for every type of exceptions