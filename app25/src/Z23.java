class Z23
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = test();
		System.out.println("main end:" + i);
	}
	public static char test() 
	{
		System.out.println("test");
		int j;//not initialized
		return j;
	}
}
//compilation error
//int can not convert into char