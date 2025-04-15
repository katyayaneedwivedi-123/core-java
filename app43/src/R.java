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

class D implements A, B, C
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
class R 
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test1();
		d1.test2();
		d1.test3();
		System.out.println("done");
	}
}
/*
D-test1
D-test2
D-test3
done
*/