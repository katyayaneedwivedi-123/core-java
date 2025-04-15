class Z19
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		double i = test();
		System.out.println("main end:" + i);
	}
	public static double test() 
	{
		System.out.println("test");
		return 10.0;
	}
}
