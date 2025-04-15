class I
{
	public static void main(String[] args) 
	{
		String s1 = "abcdefabcdef";
		//			 0123456789
		int i = s1.indexOf('d', 4);
		int j = s1.indexOf('a', 8);
		System.out.println(i);
		System.out.println(j);
	}
}
/*
9
-1
*/