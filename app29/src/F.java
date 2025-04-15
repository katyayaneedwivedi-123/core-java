class F
{
	static int i;
	static int j = test();
	
	static int test()
	{
		return i; // indirect read
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
