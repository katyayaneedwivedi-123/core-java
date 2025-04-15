package app54;

public class M62 {
	public static void main(String[] args) {
		int i = test("50");
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
//try have a return statement but the finally have already statements so try return is override with finally return then it give the finally return
//100