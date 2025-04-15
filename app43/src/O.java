interface A
{
	void test1();
	void test2();
}
abstract class B implements A
{
	public void test1()
	{
		System.out.println("test1");
	}
}
class C extends B
{
		public void test2()
	{
		System.out.println("test2");
	}
}
class O
{
	public static void main(String[] args)
	{
		C obj = new C();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}
}
//class to class inheritance is in extends
//inheritance b/w subclass and superclass is implements
//compile successfully