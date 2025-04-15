class Z20
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		boolean i = test();
		System.out.println("main end:" + i);
	}
	public static boolean test() 
	{
		System.out.println("test");
		return true;
	}
}
