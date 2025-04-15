class M4 
{
	static void test(A a1)
	{
		System.out.println("test:" + a1);
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		C c2 = new D();
		B b1 = new D();// B b1 = (B) new D();
		B b2 = new C();
		B b3 = new B();
		test(c1);
		test(c2);//test((A) c2);
		test(b1);
		test(b2);
		test(b3);
		test(new D());
		test(new B());
		test(new C());//test ((A) new C());
		test(new A());
		System.out.println("Hello World!");
	}
}
//compiler automattically upcasting to A type
/*
test:C@5305068a
test:D@65b54208
test:D@1be6f5c3
test:C@6b884d57
test:B@38af3868
test:D@77459877
test:B@5b2133b1
test:C@72ea2f77
test:A@33c7353a
Hello World!
*/