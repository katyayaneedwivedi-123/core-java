package app76;

public class M4 {
	public static void main(String[] args) {
		String s1 = "abc";//it created inside special area of the heap memory
		String s2 = new String("abc");//it create in the heap memory
		System.out.println(s1 == s2);//non constant pool generated b/c s1 and s2 objects are different
		System.out.println(s1.equals(s2));
	}
}
//both objects are not same so it create a new object 
//the output is a false true
//both s1 and s2 are different so it give the false