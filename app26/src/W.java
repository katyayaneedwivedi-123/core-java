class W
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(1.5, 45);
		System.out.println("main end:");
	}
	static void test(double i , int i)//i is already define into test method
	{
		System.out.println("test" + i);
	}
}
//compilation error