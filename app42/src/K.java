abstract class A
{
	A()
	{
		System.out.println("A()");
	}
}
abstract class B
{
	B()
	{
		System.out.println("B()");
	}
}
class C
{
	C()
	{
		System.out.println("C()");
	}
}

class K 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("Hello World!");
	}
}
