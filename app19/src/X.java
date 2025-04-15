class X
{
	public static void main(String[] args) 
	{
		int i = 1;
		for(; i <= 10; )
		{
			System.out.println("loop body begin for " + i);
			i++;
		}
		System.out.println("main end" + i);
	}
}