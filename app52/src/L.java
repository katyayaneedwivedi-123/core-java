class L 
{
	public static void main(String[] args) 
	{
		String s1 = "100t";
		Integer obj = Integer.valueOf(s1);//another overloaded method
		int i = obj.intValue();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(i);
	}
}
//number format exception b/c we give the alphabet
//in this string alphabets and special character is not allow