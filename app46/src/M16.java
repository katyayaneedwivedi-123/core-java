class M16
{
	static B test1()
	{
		return new D();
	}
	public static void main(String[] args) 
	{
		B b1 = test1();
		C c1 = (C) test1();
		D d1 = (D) test1();
		System.out.println("done");
	}
}