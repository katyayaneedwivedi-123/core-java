class A
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class B extends A 
{
	B() 
	{
		System.out.println("B()");
	}
	B(int i) 
	{
		System.out.println("B(int)");
	}
}
class C extends B
{
	C()
	{
		System.out.println("C()");
	}
	C(int i)
	{
		System.out.println("C(int)");
	}
}
class O
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1 = new A();
		System.out.println("--------------");
		B b1 = new B();
		System.out.println("--------------");
		C c1 = new C();
		System.out.println("--------------");
		A a2 = new A(10);
		System.out.println("--------------");
		B b2 = new B(20);
		System.out.println("--------------");
		C c2 = new C(30);
		System.out.println("--------------");
		System.out.println("main end");
	}
}
/*
main begin
A()
-------------
A()
B()
-------------
A()
B()
C()
-------------
A(int)
-------------
A()//first statement is super calling compiler provide this so it have no argument
B(int)
-------------
A()
B()
C(int)
-------------
main end
*/