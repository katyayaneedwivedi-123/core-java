class B 
{
	B()
	{
		this(9);
		System.out.println("B()");
	}
	B(int i)
	{
		System.out.println("B(int)");
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("------------");
		B b2 = new B(90);
		System.out.println("------------");
	}
}
