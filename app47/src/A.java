class A
{
	void test()
	{
		System.out.println("A-test");
	}
}
class B extends A 
{
	void test()
	{
		System.out.println("B-test");
	}
}
class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.test();
		
		A a2 = new B();
		a2.test();
		System.out.println("Hello World!");
	}
}

//A class test method not available in the B class