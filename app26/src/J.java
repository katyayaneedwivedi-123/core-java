class J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String i = "abc";//data type is not same
		test(i);
		System.out.println("main end");
	}
	static void test(int i)
	{
		System.out.println("test" + i);
	}
}
//compilation error