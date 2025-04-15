class M5 
{
	static void test(B b1)
	{
		System.out.println("test");
	}
	public static void main(String[] args) 
	{
		Object o1 = new C();
		A a1 = new B();
		B b1 = new C();
		C c1 = new D();
		D d1 = new D();
		//test(o1);
		//test(a1);
		test(b1);
		test(c1);
		test(d1);
		System.out.println("done");
	}
}
//compilation error
//b/c we cann't suppy o1 and a1 so it give error
//if we comment the line 14 and 15 so it run successful
/*
test
test
test
done
*/