class D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10);//10 is argument
		System.out.println("main end");
	}
	static void test(int i)//int is parameter
	{
		System.out.println("test");//we are not print 10 so only test is come in output
	}
}
/*
main begin
test
main end
*/