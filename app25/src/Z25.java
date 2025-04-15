class Z25
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = test();
		System.out.println("main end:" + i);
	}
	public static int test() 
	{
		System.out.println("test");
		return f1();
	}
	public static int f1() 
	{
		System.out.println("f1");
		return 300;
	}
}
