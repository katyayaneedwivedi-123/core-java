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
class C extends B
{
	void test3()
	{
		System.out.println("C-test3");//concrete method
	}
}

class I
{
	public static void main(String[] args) 
	{
		C obj = new C();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("done");
	}
}
// it run successfully 
//b/c we are creating class C seperatelly