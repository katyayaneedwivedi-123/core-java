class Z14
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		long b1 = test();
		System.out.println("main end:" + b1);
	}
	public static long test() 
	{
		System.out.println("test");
		return 50000;
	}
}