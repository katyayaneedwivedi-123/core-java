class V
{
	public static void main(String[] args) 
	{
		int i = 1;
		System.out.println(test1(i++ + i) + test2(i++ +i) + test3(i++ + i) + i);
	}
	public static int test1(int i)
	{
		return test2(i + test3(i++ + i) + test3(i));
	}
	public static int test2(int i)
	{
		return test3(i++ + i) + test3(i);
	}
	public static int test3(int i)
	{
		return i++ + i;
	}
}