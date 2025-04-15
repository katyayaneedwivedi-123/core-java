class C
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10, 30);//required is one we supply 2 value so it error
		System.out.println("main end");
	}
	static void test(int i)
	{
		System.out.println("test");
	}
}
//compilation error