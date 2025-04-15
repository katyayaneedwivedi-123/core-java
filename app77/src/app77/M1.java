package app77;

public class M1 {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("abc");
		StringBuffer s2 = new StringBuffer("abc");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));//this is false b/c equals method check the address memory location
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
//in StringBuffer in equals method return true 
//if both the object is same if not same then it return the false
//StringBuffer and StringBuilder both are the mutable 