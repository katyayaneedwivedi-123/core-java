class K
{
	static void test()
	{
		System.out.println(i);
	}
	static
	{
		test();
	}
	
	static int i;
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//it is not a direct read b/c it call the test it is indirectry