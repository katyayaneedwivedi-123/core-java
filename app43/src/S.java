interface A
{
	void test1();
}
interface B
{
	void test2();
}

interface C
{
	void test3();
}
class P
{
	void test4()
	{
		System.out.println("P-test4");
	}
}

class D extends P implements A, B, C
{
	public void test1()
	{
		System.out.println("D-test1");
	}
	public void test2()
	{
		System.out.println("D-test2");
	}
	public void test3()
	{
		System.out.println("D-test3");
	}
}
class S 
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test1();
		d1.test2();
		d1.test3();
		d1.test4();
		System.out.println("done");
	}
}