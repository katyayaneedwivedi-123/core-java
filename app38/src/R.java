class A 
{
	A(int i)
	{
		System.out.println("A(int)");
	}
	/*
	A()
	{
		System.out.println("A()");//is not here so it give error
	}
	*/
}
class R extends A
{
	R(int i)
	{
		System.out.println("R(int)");
	}
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		System.out.println("---------------");
		R r1 = new R(90);
	}
}
//compilation error
//R class conation a superwith no argument so A class no argument constractor not available