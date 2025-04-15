class E
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10);
		System.out.println("main end");
	}
	static void test(int i)
	{
		System.out.println("test" + i);
	}
}
/*
main begin
test10
main end
*/