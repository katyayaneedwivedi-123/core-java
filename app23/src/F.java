class F
{
	public static void main(String[] args) 
	{
		int i = 1;
		do
		{
			System.out.println("body begin:" + i);
			if(i == 3)
			{
				 i++;
				 continue;
			}
			System.out.println("body end:" + i);
			i++;
		}
		while (i <= 5);
		System.out.println("main end:" + i);
	}
}