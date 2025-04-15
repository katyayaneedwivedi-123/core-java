interface A
{
}
class Z29 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1 = test();
		System.out.println("main end:" + a1);
	}
	public static A test() 
	{
		System.out.println("test");
		return null;
	}
}
