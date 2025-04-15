class I
{
	public static void main(String[] args) 
	{
		int i = 1;
		while(i <= 5)
		{
			System.out.println("loop body:" + i);
			if(i >= 3)
			{
				System.out.println("if block" + i);
				break;
			}
			System.out.println("loop body:" + i);
			i++;
		}
		System.out.println("main end:" + i);
	}
}