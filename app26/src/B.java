class B
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(true);//value is not compatible to parameter
		System.out.println("main end");
	}
	static void test(int i)
	{
		System.out.println("test");
	}
}
//compilation error
//boolean can not converted into int