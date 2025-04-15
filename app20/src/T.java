class T
{
	public static void main(String[] args) 
	{
		System.out.println("hello" + test1(test2(40+30)));
	}
	public static int test1(int i)
	{
		System.out.println("test1");
		return i + 10;
	}
	public static int test2(int i)
	{
		System.out.println("test2");
		return i + 30;
	}
}