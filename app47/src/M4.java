class A
{
	static void test()
	{
		System.out.println("A-test()");
	}
}
class B extends A
{
	static void test()
	{
		System.out.println("B-test()");//B is staic so it acting A member only so A print not B
	}
}
class M4
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new B();
		A[] elements = {a1, a2};
		for(A element : elements)
		{
			element.test();//(A.test)used and  the B cannot be used b/c it is static
		}
	}
}
/*
A-test()
A-test()
*/
//static members are not overriding
//A class test method not overriding in the B it is looking like a overriding