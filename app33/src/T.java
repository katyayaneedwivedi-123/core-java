class T 
{
	int i;
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("----------");
		test2();
		System.out.println("main end");
	}
	static void test1()
	{
		System.out.println("test1 begin");
		T t1 = new T();
		System.out.println("test1:" + t1.i);
		t1.i = 20;
		System.out.println("test1:" + t1.i);
		System.out.println("test1 end");
	}
	static void test2()
	{
		System.out.println("test2 begin");
		T t1 = new T();
		System.out.println("test2:" + t1.i);
		t1.i = 220;
		System.out.println("test2:" + t1.i);
		System.out.println("test2 end");
	}
}
//compile successfully