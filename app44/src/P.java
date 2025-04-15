class X
{
}
class Y extends X
{
}
class Z extends Y
{
}




class A
{
	Y test(int i, int j)
	{
		System.out.println("A-test");
		return null;
	}
}
class P extends A 
{
	int test(int p, int q)
	{
		System.out.println("I-test");
		return null;
	}
	public static void main(String[] args) 
	{
		P obj = new P();
		obj.test(23, 40);
		System.out.println("done");
	}
}
//Y is derived data type
//compilation error