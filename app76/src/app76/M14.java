package app76;

public class M14 {
	public static void main(String[] args) {
		String s1 = "abc xyz";
		//           0123456
		
		System.out.println(s1.substring(4, 7));
		System.out.println(s1.substring(0, 3));
		System.out.println(s1.substring(3, 3));//it both are same then it not returning the value
		System.out.println(s1.substring(4));
	}
}
