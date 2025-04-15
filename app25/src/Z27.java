class Z27 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1 = test();
		System.out.println("main end");
	}
	public static String test() 
	{
		System.out.println("from test");
		return "abc";
	}
}
