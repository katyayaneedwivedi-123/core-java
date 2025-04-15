package app76;

public class M12 {
	public static void main(String[] args) {
		String s1 = " abc xyz 123 ";
		System.out.println(s1.length());//13
		s1 = s1.trim();
		System.out.println(s1.length());//11
	}
}
//trim method is reading and training in spaces
//trim method create the new object to it not point the old object 
//so s1 is change 