class Z3
{
	public static void main(String[] args) 
	{
		int i = 1;
		System.out.println("main1:" + i);//1
		int j = test1(i + i++ + i);
		System.out.println("main2:" + i);//2
		System.out.println("main3:" + j);//9
	}
	public static int test1(int i) 
	{
		System.out.println("test1:" + i);//4
		return i++ + i;
	}
}
