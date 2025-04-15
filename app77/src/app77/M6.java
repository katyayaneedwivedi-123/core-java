package app77;

public class M6 {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer(50000);
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		s1.append("abc");
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		s1.append("asdhjdfhwjkgehiuseghwiuykaoiesjadwkfhgdzjguflfkpoeesif");
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		System.out.println("------------");
		s1.trimToSize();
		System.out.println(s1.capacity());
		System.out.println(s1.length());
	}
}
//if we have no need of adding extra capacity then we remove the capacity