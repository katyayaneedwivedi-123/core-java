package app76;

public class M8 {
	public static void main(String[] args) {
		String s1 = "abc";
		System.out.println(s1);//abc
		s1 = s1.concat("xyz");//it create a new object so it effect on the s1
		System.out.println(s1);//s1 is pointing to the new object//abcxyz
	}
}
//whatever concate method is returning they are receiving to s1
//so s1 is pointing to the new object