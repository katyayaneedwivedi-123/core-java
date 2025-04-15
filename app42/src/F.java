abstract class A//abstract class
{
	abstract void test1();//abstract method
	void test2()
	{
		System.out.println("A-test2");//concrete method
	}
	abstract void test3();//abstract method
}
abstract class B extends A
{
	void test1()
	{
		System.out.println("B-test1");//concrete method
	}
}

class F
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//done