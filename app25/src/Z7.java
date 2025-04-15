class Z7
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		boolean b1 = test();//it is a boolean type and the return value is int it not convert in boolean type
	}
	public static int test() 
	{
		System.out.println("test");
		return 30;
	}
}
//compilation error