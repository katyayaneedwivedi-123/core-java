package app59;

public class M8 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = "abc";
		String s4 = "abc";
	//it override on self b/c it have string so it do automatically	
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
//eventhough the object is different but it returning the same value
//inside a string class hashcode method overrided it is generating integer number based on the String content