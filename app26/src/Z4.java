class Z4
{
	public static void main(String[] args) 
	{
		int i = 1;
		System.out.println("main1:" + i);
		int j = test1(i++ + i) + i + test2(i++ + i) + i++ + test3(++i + i) + i +
				test4(i++ + i) + i + test1(++i + i) + i++ + test2(++i + i) + i;
		System.out.println("main2:" + i);
		System.out.println("main3:" + j);
	}
	public static int test1(int i) 
	{
		return i++ + i;
	}
	public static int test2(int i) 
	{
		return ++i + i;
	}
	public static int test3(int i) 
	{
		return i-- + i;
	}
	public static int test4(int i) 
	{
		return --i + i;
	}
}
