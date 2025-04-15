
class A
{
	static void test();//cannot use the test class directly
	{
		System.out.println("test");
	}
}
class F
{
	public static void main(String[] args) 
	{
		test();
		System.out.println("done");
	}
}
//compilation error