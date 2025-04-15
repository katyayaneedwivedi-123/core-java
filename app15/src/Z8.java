class Z8
{
	public static void main(String[] args) 
	{
		System.out.println(1);//1
		if(false)
		{
			System.out.println(2);
		}
		else if(true)
		{
		System.out.println(4);//4
		}
		else if(true)
			{
				System.out.println(6);
			}
		System.out.println(9);//9
	}
}