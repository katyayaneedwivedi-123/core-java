class Z9
{
	static int i = test();
	static int test()
	{
		System.out.println("test:" + i);
		main(null);
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("main:" + i);
	}
}
/*
test:0
main:0
main:10
*/