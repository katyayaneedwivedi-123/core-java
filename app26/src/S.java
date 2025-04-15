class S
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(2.3);
		System.out.println("main end:");
	}
	static void test(double i)
	{
		System.out.println("test" + i);
	}
}