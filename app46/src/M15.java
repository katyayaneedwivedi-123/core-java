class M15
{
	static B test()
	{
		return new D();
	}
	public static void main(String[] args) 
	{
		B b1 = test1();
		C c1 = test1();
		D d1 = test1();
		System.out.println("done");
	}
}
//compilation error