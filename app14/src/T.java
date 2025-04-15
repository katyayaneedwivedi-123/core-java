class T
{
	public static void main(String[] args) 
	{
		System.out.println(1);//1
		if(true)
			if(true)
				if(true)
				{	
					System.out.println(4);//4
				}
				else
				{
					System.out.println(5);
				}
			else
			{
				System.out.println(7);
			}
		else
		{
			System.out.println(9);
		}
		System.out.println(10);//10
	}
}