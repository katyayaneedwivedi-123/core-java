class O
{
	static int test()
	{
		System.out.println(j);
		return j;
	}
	static int i = test();
	static int j;
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}