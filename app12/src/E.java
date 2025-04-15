class E
{
	public static void main(String[] args) 
	{
		System.out.println(1);	//	1
		if(true)
		{
			System.out.println(2);	//	2
			if(false)
				System.out.println(3);	//	only one statement in the body
			System.out.println(4);	//	4
		}
		System.out.println(5);	//	5
	}
}
