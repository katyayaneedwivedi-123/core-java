class B 
{
	void test()
	{
		System.out.println("test()");
	}
	void test(int i)
	{
		System.out.println("test(int)");
	}
	void test(int i, int j)
	{
		System.out.println("test(int, int)");
	}
	void test(int i, double j)
	{
		System.out.println("test(int, double)");
	}
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.test();
		System.out.println("-----------");
		obj.test(20);
		System.out.println("-----------");
		obj.test(20, 40);
		System.out.println("-----------");
		obj.test(20, 4.4);
		System.out.println("-----------");
	}
}
//compile successfully
//all the method same and run successfully b/c change in the signature
//no of argument or args data type