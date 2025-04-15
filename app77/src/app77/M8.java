package app77;

public class M8 {
	public static void main(String[] args) {
		String s1 = "abc";
		StringBuffer sb = new StringBuffer("abc");
		
	//	s1.delete();
		sb.delete(0, 1);
		System.out.println(sb);
	}
}
//string doesn't have a delete method but
//stringBuffer have a delete method