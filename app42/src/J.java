abstract class A
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
	abstract void test4();//All are abstract method not a concrete method 
	void test5()
	{
	}
	void test6()
	{
	}
}
abstract class B
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
	abstract void test4();
}

class C// C class can be concrete or abstract
{
	void test5()
	{
	}
	void test6()
	{
	}
}

class J 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//Hello World!
// A and B both are declaring as abstract then it run otherwise it give error
// class C is optional to declared abstract