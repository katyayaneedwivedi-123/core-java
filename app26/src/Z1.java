class Z1
{
	public static void main(String[] args) 
	{
		int i = 1;
		System.out.println("main1:" + i);
		int j = test1(i++);
		System.out.println("main2:" + i);
		System.out.println("main3:" + j);
	}
	public static int test1(int i) 
	{
		System.out.println("test1:" + i);
		return ++i;
	}
}
