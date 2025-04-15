class A 
{
	A(int i)
	{
		System.out.println("A(int)");
	}
	A()
	{
		System.out.println("A()");//this is here so it compile succesfully
	}
}
class S extends A
{
	S(int i)
	{
		System.out.println("S(int)");
	}
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		System.out.println("---------------");
		S r1 = new S(90);
	}
}