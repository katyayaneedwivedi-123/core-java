package app76;

public class M5 {
	public static void main(String[] args) {
		String s1 = "abc";
		System.out.println(s1);
		s1 = s1 + "xyz";
		System.out.println(s1);
	}
}
//+ operator uses new operation if any one operand is 
//a reference variable then it uses new operator
//means s1 is one object and xyz is a one object then it create a new object
//abcxyz