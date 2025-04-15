class A 
{
	public static void main(String[] args) 
	{
		int i = 1;
		do
		{
			System.out.println("from body:" + i);
			i++;
		}
		while (i <= 5);
		System.out.println("main end:" + i);
	}
}
