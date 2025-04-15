class A
{
	private void test()//private test means method can't used in other classes
	{
		System.out.println("test()");
	}
}
class E 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		e1.test();
		System.out.println("done");
	}
}
//compilation error
//private method can't used in other classes