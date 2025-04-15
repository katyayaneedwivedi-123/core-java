class S
{
	public static void main(String[] args) 
	{
		System.out.println("hello" + test2(test1(40)));
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
/*
test1
test2
hello80
*/