class A 
{
	A(int i)
	{
		System.out.println("A(int)");
	}
	A()
	{
		System.out.println("A()");
	}
}
class T extends A
{
	T(int i)
	{
		super(90);//this is super class with int so only int is print not A()
		System.out.println("T(int)");
	}
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		System.out.println("---------------");
		T r1 = new T(90);
	}
}
/*
A(int)
---------------
A(int)
T(int)
*/