package app76;

public class M11 {
	public static void main(String[] args) {
		String s1 = " abc xyz 123 ";
		System.out.println(s1.length());//13
		s1.trim();
		System.out.println(s1.length());//13
	}
}
//s1 pointing to the old object only it not pointing the new object
//so the trim change is not effect to the s1
//so it give the 13 13 two times