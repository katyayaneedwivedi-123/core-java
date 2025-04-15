package app76;

public class M10 {
	public static void main(String[] args) {
		String s1 = "ja";
		String s2 = "va";
		String s3 = "java";
		String s4 = s1.concat("va");
		String s5 = "ja".concat(s2);
		String s6 = "ja".concat("va");
		String s7 = s1.concat(s2);
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
		System.out.println(s3 == s6);
		System.out.println(s3 == s7);
		System.out.println(s4 == s5);
		System.out.println(s4 == s6);
		System.out.println(s4 == s7);
		System.out.println(s5 == s6);
		System.out.println(s5 == s7);
		System.out.println(s6 == s7);
		
		//if we make constant pool in the conact so we force to calling of the intern method like this
		String s8 = s1.concat(s2).intern();
		System.out.println(s8 == "java");
	}
}
//concat method not create the constant poool if we want this then we call the intern
//in concat method one side one object and another side one object
//so it create the new object so it give all are false