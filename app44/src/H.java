class A
{
	void test()
	{
		System.out.println("test");//no arg inherited test method
	}
}
class H extends A
{
	void test(int i)
	{
		System.out.println("test(int)");//inherited test method
	}
	public static void main(String[] args) 
	{
		H h1 = new H();
		h1.test();
		System.out.println("-------------------");
		h1.test(20);
		System.out.println("-------------------");
	}
}
//method overloading can happen with superclass method also
//inherited test method not given
//method oerloading can be achieve with inherited method also