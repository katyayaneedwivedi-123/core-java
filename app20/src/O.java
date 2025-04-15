class O
{
	public static void main(String[] args) 
	{
		int i = test() + test();
		System.out.println("-------------");
		System.out.println(i + test());
	}
	public static int test()
	{
		System.out.println("test");
		return 10;
	}
}
