class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10);
		System.out.println("main end");
	}
	static void test(int i)
	{
		System.out.println("test begin:" + i);
		i = 20;
		System.out.println("test end:" + i);
	}
}
/*
main begin
test begin:10
test end:20
main end
*/