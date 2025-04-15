class I 
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println("main1:" + a);
		a = 2;
		System.out.println("main2:" + a);
		a = 4;
		System.out.println("main2:" + a);
		a = 3;
		System.out.println("main2:" + a);
	}
}
