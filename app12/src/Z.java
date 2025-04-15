class Z
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if(true)
		{
			System.out.println(2);
			if (true)
					if(true)
						System.out.println(4);
				System.out.println(6);
		}
		System.out.println(7);
	}
}
