package app76;

public class M3 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);//non constant pool in here == check the memory address location if same then it return true other wise false 
		System.out.println(s1.equals(s2));
	}
}
//in double equals connecting to the pool if the method are not same 
//then this is called non constant pool
//both s1 and s2 are not same so it create a new pool
// both are creating a new object so they are created a constant pool