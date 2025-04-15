class Q
{
	public static void main(String[] args) 
	{
		int i = 10 + test();
		System.out.println(i);
	}
	public static void test()
	{
		System.out.println("test");
	}
}
//compilation error
//void type is not allow 