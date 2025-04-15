class Z12
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		byte b1 = test();
		System.out.println("main end:" + b1);
	}
	public static byte test() 
	{
		System.out.println("test");
		return 150;//outof range in byte
	}
}
//compilation error