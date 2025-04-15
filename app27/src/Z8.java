class Z8 
{
	static int i = test();
	static int test()
	{
		System.out.println("test:" + i);
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("main:" + i);
	}
}