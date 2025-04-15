package app76;

public class M15 {
	public static void main(String[] args) {
		String s1 = "a1;b;xyz;789;abc";
		//	         0123456
//		System.out.println(s1.split(s1));//it give only the address
		String[] values = s1.split(";");
		for(String str : values) {
			System.out.println(str);
		}
	}
}
//we can use ; as a separator in split method
