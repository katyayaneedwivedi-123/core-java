class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		test(i);
		System.out.println("main end");
	}
	static void test(int i)
	{
		System.out.println("test" + i);
	}
}
//without initializing we are using so it error
//compilation error