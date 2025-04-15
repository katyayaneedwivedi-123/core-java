class C 
{
	private void test()
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
	protected void test(int i, double j)
	{
		System.out.println("test(int, double)");
	}
	public static void main(String[] args) 
	{
		C obj = new C();
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