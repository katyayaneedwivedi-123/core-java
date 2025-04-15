class Z21
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		char i = test();
		System.out.println("main end:" + i);
	}
	public static char test() 
	{
		System.out.println("test");
		return 's';
	}
}
