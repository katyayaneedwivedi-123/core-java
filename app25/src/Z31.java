interface B
{
}
class C
{
}
class Z31
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B obj1 = test1();
		System.out.println(obj1);
		C obj2 = test2();
		System.out.println(obj2);
	}
	public static B test1() 
	{
		System.out.println("test1");
		return null;
	}
	public static C test2() 
	{
		System.out.println("test2");
		return null;
	}
}
