class Z6
{
	public static void main(String[] args) 
	{
		System.out.println(1);	//	1
		int i = 10;
		if(true || ++i == i++)
		{
			System.out.println(2);	//	2
			System.out.println(i);	//	10
			i++;
		}
		System.out.println(3);	//	3
		System.out.println(i);	//	11
	}
}
