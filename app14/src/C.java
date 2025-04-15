class C 
{
	public static void main(String[] args) 
	{
		System.out.println(1);//1
		if(false)
		{
			System.out.println(2);
			if(true)
			{
				System.out.println(3);
			}
			else
			{
				System.out.println(4);
			}
			System.out.println(5);
		}
		else
		{
			System.out.println(6);//6
		}
		System.out.println(7);//7
	}
}
