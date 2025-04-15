class B 
{
	private void test()//test is private method
	{
		System.out.println("B()");
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test();
		System.out.println("done");
	}
}
//private member of any class should be used in same class
