class P1
{
	public static void main(String[] args) 
	{
		int i = 7;
		switch (i)
		{
		case 1:
			System.out.println("from case 1");
			break;
		case 2:
			{
				System.out.println("from case 2");
				break;
			}
		case 3:
			System.out.println("from case 3");
			break;
		}
		System.out.println("end");
	}
} 