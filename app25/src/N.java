class N
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("--11--");
		test2();
		System.out.println("--22--");
		test2();
		System.out.println("--33--");
		test1();
		System.out.println("--44--");
		System.out.println("main end");
	}
	public static void test1() 
	{
		System.out.println("from test1");
		test2();
		test2();
	}
	public static void test2() 
	{
		System.out.println("from test2");
	}
}