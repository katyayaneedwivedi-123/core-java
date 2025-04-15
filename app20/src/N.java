class N
{
	public static void main(String[] args) 
	{
		System.out.println(test() + test() + "hello");
		System.out.println("-----------------------");
		System.out.println("hello" + test() + test());
	}
	public static int test()
	{
		System.out.println("test");
		return 10;
	}
}
