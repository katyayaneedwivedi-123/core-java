class U
{
	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println("hello" + test1(test2(i++ + i) + i++) + i);
		System.out.println("-----------");
		System.out.println("hello" + i);
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
test2
test1
hello7212
-----------
hello12
*/