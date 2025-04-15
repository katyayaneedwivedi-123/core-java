class R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(2.3);
		System.out.println("main end:" + i);
	}
	static void test(int i)
	{
		System.out.println("test" + i);
	}
}
//compilation error
//int cann't be convert in double