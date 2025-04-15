class N
{
	public static void main(String[] args) 
	{
		String s1 = "abchelloxyz";
		//			 0123456789
		String s2 = s1.substring(3, 8);
		String s3 = s1.substring(0, 3);
		String s4 = s1.substring(8, 11);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
/*
abchelloxyz
hello
abc
xyz
*/