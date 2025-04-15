class G 
{
	static int i;
	G()
	{
		System.out.println("G():" + i);
	}
	void test1()
	{
		System.out.println("test1():" + i);
	}
	static void test2()
	{
		System.out.println("test2():" + i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main:" + i);
		test2();
		G obj = new G();
		obj.test1();
	}
	{
		System.out.println("IIB:" + i);
	}
	static
	{
		System.out.println("SIB:" + i);
	}
}
