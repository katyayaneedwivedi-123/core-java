class Z18
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		float i = test();
		System.out.println("main end:" + i);
	}
	public static float test() 
	{
		System.out.println("test");
		return 10.0f;
	}
}
