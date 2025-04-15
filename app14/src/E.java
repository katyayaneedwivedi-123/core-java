class E
{
	public static void main(String[] args) 
	{
		System.out.println(1);//1
		if(true)
			if(true)
			{
				System.out.println(3);//3
			}
			else
			{
				System.out.println(4);
			}
		else
		{
			System.out.println(6);
		}
		System.out.println(7);//7
	}
}
