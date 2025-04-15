class E
{	
	static int test()
	{
		System.out.println("test");
		return 20;
	}
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
	static int i = test();
}