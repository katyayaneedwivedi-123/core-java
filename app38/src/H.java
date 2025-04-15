class G 
{
	static void test1()
	{
		System.out.println("test1");
	}
}
class H extends G
{
	static void test2()
	{
		System.out.println("test2");
	}
	public static void main(String[] args) 
	{
		test1();
		test2();
		System.out.println("done");
	}
}
//all method attributed inheriting to sub class	
