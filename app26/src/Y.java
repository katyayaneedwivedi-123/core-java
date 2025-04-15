class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(23, 45);
		System.out.println("main end:");
	}
	static void test(int i , int j)
	{
		System.out.println("test" + i);
		System.out.println("test" + j);
	}
}