class D
{
	static int i = test();
	static
	{
		System.out.println("sib1");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
	static
	{
		System.out.println("sib2");
	}
	static int test()
	{
		System.out.println("test");
		return 20;
	}
}