class D
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		//			 01234
		char[] chars = s1.toCharArray();
		for(int i = 0; i < s1.length; i++)
		{
			System.out.println(chars[i]);
		}
	}
}