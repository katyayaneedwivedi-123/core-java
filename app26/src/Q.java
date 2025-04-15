class Q
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		test(++i + i);
		System.out.println("main end:" + i);
	}
	static void test(int i)
	{
		System.out.println("test" + i);
		i = 40;
	}
}