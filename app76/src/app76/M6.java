package app76;

public class M6 {
	public static void main(String[] args) {
		String s1 = "ja";
		String s2 = "va";
		String s3 = "java";
		String s4 = s1 + s2;
		String s5 = "ja" + s2;
		String s6 = s1 + "va";
		String s7 = "ja" + "va";//it creating only constant pool
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
		System.out.println(s3 == s6);
		System.out.println(s3 == s7);//s3 and s7 are same it is true
		System.out.println(s4 == s5);
		System.out.println(s4 == s6);
		System.out.println(s4 == s7);
		System.out.println(s5 == s6);
		System.out.println(s5 == s7);
		System.out.println(s6 == s7);
		
		//if we forcing the +operator for constant pool then we call the intern method
		
		String s8 = (s1 + s2).intern();
		String s9 = "java";
		System.out.println(s8 == s9);
	}
}
//s3 and s7 both are the same object