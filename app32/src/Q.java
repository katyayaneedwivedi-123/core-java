class Q
{
	public static void main(String[] args) 
	{
		String s1 = "abc xyz hello test";
		String [] all = s1.split(" ");
		for (String item : all)
		{
			System.out.println(item);
		}
	}
}
/*
abc
xyz
hello
test
*/