package app76;

public class M2 {
	public static void main(String[] args) {
		String s1 = "abc";//it create a object heap inside the special area
		String s2 = "abc";//it reuse this object
		System.out.println(s1 == s2);//constant pool b/c both objects are the same
		System.out.println(s1.equals(s2));
	}
}
//in toString method content are same then both are created
//without a new operator it created constant pool
//equals method got override it is checking the content 
//content is same 
//both are the strings are come in the same circle so it created a constant pool 
//check the circle in note book