package app77;

public class M7 {
	public static void main(String[] args) {
		String s1 = "abc";
		StringBuffer sb = new StringBuffer("abc");
		
	//	s1.reverse();
		sb.reverse();
		System.out.println(sb);
	}
}
//string doesn't built reverse method but the 
//StringBuffer built in reverse method available