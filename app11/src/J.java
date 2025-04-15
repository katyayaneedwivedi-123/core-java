class J 
{
	public static void main(String[] args) 
	{
		System.out.println(1);	//	1
		int i = 10;
		if (false)
		{
			System.out.println(2);
			System.out.println(i);
			i = i + 20;
		}
		System.out.println(3);	//	3
		System.out.println(i);	//	10
	}
}
