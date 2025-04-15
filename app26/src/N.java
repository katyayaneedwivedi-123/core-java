class N
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		test(i++);
		System.out.println("main end:" + i);
	}
	static void test(int i)
	{
		System.out.println("test" + i);
		i = 40;
	}
}
/*
main begin
test10
main end:11
*/