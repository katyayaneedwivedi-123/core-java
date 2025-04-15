class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();//in the test we are not provide any argument like test(23)
		System.out.println("main end");
	}
	static void test(int i)
	{
		System.out.println("test");
	}
}
//compilation error