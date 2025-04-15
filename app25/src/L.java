class L 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		test2();
		test2();
		test1();
		System.out.println("main end");
	}
	public static void test1() 
	{
		System.out.println("from test1");
	}
	public static void test2() 
	{
		System.out.println("from test2");
	}
}
/*
main begin
from test1
from test2
from test2
from test1
main end
*/