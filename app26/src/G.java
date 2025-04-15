class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10);
		System.out.println("main end:" + i);
	}
	static void test(int i)
	{
		System.out.println("test begin:" + i);
		i = 20;
		System.out.println("test end:" + i);
	}
}
//i is local to test method it can't used anyother method
//compilation error