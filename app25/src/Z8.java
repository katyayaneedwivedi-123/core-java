class Z8
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		int b1 = test(); 
	}
	public static int test() 
	{
		System.out.println("test");
		return 30;
	}
}
/*
main
test
*/