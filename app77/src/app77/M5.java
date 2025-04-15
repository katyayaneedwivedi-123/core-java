package app77;

public class M5 {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		s1.append("abc");
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		s1.append("asdhjdfhwjkgehiuseghwiuykaoiesjadwkfhgdzjguflfkpoeesif");
		System.out.println(s1.capacity());
		System.out.println(s1.length());
	}
}
//default capacity is 16
//if we self to create an object then automatically capacity increased