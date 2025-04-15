abstract class A//abstract class
{
	abstract void test1();//abstract method
	void test2()
	{
		System.out.println("A-test2");//concrete method
	}
	abstract void test3();//abstract method
}
class B extends A
{
	void test1()
	{
		System.out.println("B-test1");//concrete method
	}
	void test3()
	{
		System.out.println("C-test3");//concrete method
	}
}

class H
{
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("done");
	}
}
//it compile successfully
//b/c in B class we can overrided all test method