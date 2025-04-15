class F
{
	public static void main(String[] args) 
	{
		System.out.println(1);	//	1
		if(true)
		{
			if(true)
				System.out.println(3);	//	3 (one unit)b/c both are go in one group
		}
		System.out.println(5);	//	5
	}
}
	//	line 7 and 10 is optional b/c both are in same group