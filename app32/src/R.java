class R
{
	public static void main(String[] args) 
	{
		String s1 = "abc xyz hello test";
		String [] all = s1.split(";");//; is use in split method it print the o/p in same line
		for (String item : all)
		{
			System.out.println(item);
		}
	}
}
/*
abc xyz hello test
*/