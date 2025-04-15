 class P 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main begin");
	}
	public static void test1() 
	{
		System.out.println("test1 begin");
		test2();
		System.out.println("test1 begin");
	}
	public static void test2() 
	{
		System.out.println("test2 begin");
		test1();
		System.out.println("test2 begin");
	}
}
//stack overflow condition
// stack overflow error is a runtime object