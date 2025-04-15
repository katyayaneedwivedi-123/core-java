class Z13
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		short b1 = test();
		System.out.println("main end:" + b1);
	}
	public static short test() 
	{
		System.out.println("test");
		return 150;
	}
}