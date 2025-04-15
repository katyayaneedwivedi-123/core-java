package app54;

public class M61 {
	public static void main(String[] args) {
		int i = test("abc");
		System.out.println(i);
	}
	static int test(String s1) {
		try {
			int i = Integer.parseInt(s1);
			return i;
		} 
		catch (NumberFormatException ex) {
			return 0;
		}
		finally {
			return 100;
		}
	}
}
// if try and catch any statement is executed then it goes to the finally block so return of try and catch is replacing the finally return so it give 100