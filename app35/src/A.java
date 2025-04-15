class A 
{
	A()//constructor signature
	{
		System.out.println("A()");
	}
	A(int i)//constructor signature
	{
		System.out.println("A(int)");
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("------------------");
		A a2 = new A(23);
		System.out.println("------------------");
		A a3 = new A();
		System.out.println("------------------");
		A a4 = new A(40);
		System.out.println("------------------");
	}
}
/*
A()
-------------
A(int)
-------------
A()
-------------
A(int)
-------------
*/
//i is a member of vary any one arg of datatype should change 