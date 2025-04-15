interface A
{
	void test1();
}
class K
{
	A obj;//attribute of K class
	
	A hello()
	{
		return obj;//it also a interface type
	}
	
	void hello1(A a1)
	{
		//method or constructor also a parameter of interface type
	}
	public static void main(String[] args)
	{
		A a1 = null;//local variable also a interface type
		//a1 = new A();
		System.out.println("done");
	}
}
//every class interface comes under the derived data type