class M13
{
	static void test(C c1)
	{
		System.out.println("test");
	}
	public static void main(String[] args) 
	{
		A a1 = new D();
		test(a1);//it required C type but we give A type so error
		System.out.println("done");
	}
}
//A is down casting to C
//compilation error