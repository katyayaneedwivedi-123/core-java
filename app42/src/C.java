abstract class A
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
	abstract void test4();
	void test5()
	{
	}
	void test6()
	{
	}
}
class C 
{
	A obj;//attribute
	A hello()//mthod 
	{
		return obj;//method return type
	}
	
	void hello(A a1)//method
	{//method parameter
	}
	
	public static void main(String[] args) 
	{
		A a1 = null;
		//a1 = new A();//this line is syntactically not correct means cannot be instantiated
		System.out.println("Hello World!");
	}
}
// so it compilation error