class D 
{
	D()
	{
		System.out.println("D()");
	}
	D(int i)
	{
		System.out.println("D(int)");
	}
	{
		System.out.println("D-IIB");
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("--------------");
		D d2 = new D(20);
		System.out.println("--------------");
	}
}
/*
D-IIB
D()
-------------
D-IIB
D(int)
-------------
*/