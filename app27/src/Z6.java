class Z6 
{
	static int i = test();//calling from the initializer
	static int test()
	{
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}