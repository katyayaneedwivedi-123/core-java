class C 
{
	public static void main(String[] args) 
	{
		if(test())
		{
			System.out.println("if-block");
		}
		else
		{
			System.out.println("else-block");
		}
			System.out.println("main-end");
	}
	static boolean test()
	{
		return true;
	}
}
