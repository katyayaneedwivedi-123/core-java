class D
{
	private void test()
	{
		System.out.println("test()");
	}
	int test(int i)
	{
		System.out.println("test(int)");
		return 10;
	}
	public boolean test(int i, int j)
	{
		System.out.println("test(int, int)");
		return false;
	}
	protected void test(int i, double j)
	{
		System.out.println("test(int, double)");
	}
	
	
		
	
	public static void main(String[] args) 
	{
		D obj = new D();
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