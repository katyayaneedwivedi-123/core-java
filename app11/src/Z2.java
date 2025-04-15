class Z2 
{
	public static void main(String[] args) 
	{
		System.out.println(1);	//	1
		int i = 10;
		if(i++ == 11)
		{
			System.out.println(2);
			System.out.println(i);
			i++;
		}
		System.out.println(3);	//	3
		System.out.println(i);	//	11 b/c of i++ in if block it become 11
	}
}
	//	but if block false then it not executed