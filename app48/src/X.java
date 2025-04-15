class A
{
	final void test()
	{
		System.out.println("A-test");
	}
}
class X extends A 
{
	void test()
	{
		System.out.println("X-test");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//compilation error
//final method can not be override in the subclasses
//final method can not be  modify the subclass