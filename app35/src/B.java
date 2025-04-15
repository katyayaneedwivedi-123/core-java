class B 
{
	B(int i)
	{
		System.out.println("B(int i)");
	}
	B(double i)
	{
		System.out.println("B(double i)");
	}
	public static void main(String[] args) 
	{
		B b1 = new B(90);
		System.out.println("----------------");
		B b2 = new B(901);
		System.out.println("----------------");
		B b3 = new B(90);
		System.out.println("----------------");
		B b4 = new B(4.5);
		System.out.println("----------------");
	}
}
/*
B(int i)
-------------
B(int i)
-------------
B(int i)
-------------
B(double i)
-------------
*/