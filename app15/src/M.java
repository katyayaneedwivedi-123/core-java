class M
{
	public static void main(String[] args) 
	{
		System.out.println(1);//1
		if(true)
		{
			System.out.println(2);//2
		}
		else
		{
			System.out.println(3);
			if(true)
			{
				System.out.println(4);
			}
			else
			{
				System.out.println(44);
			}
			System.out.println(5);
		}
		System.out.println(6);//6
	}
}