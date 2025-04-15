class K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int p = 10;//p is int type so we used as i
		test(p);
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