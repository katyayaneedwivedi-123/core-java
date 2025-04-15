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

class G
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
//compilation error
//b/c we trying to creat object in B but is abstract we cannot creat object