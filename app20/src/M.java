class M
{
	public static void main(String[] args) 
	{
		System.out.println("test() + test()");
		System.out.println("---------------");
		System.out.println(test() + test());
	}
	public static int test()
	{
		System.out.println("test");
		return 10;
	}
}
