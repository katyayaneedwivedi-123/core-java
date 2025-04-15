class A
{
	void test(int i, int j)
	{
		System.out.println("A-test");
	}
}
class M extends A 
{
	int test(int p, int q)
	{
		System.out.println("I-test");
		return 30;
	}
	public static void main(String[] args) 
	{
		M obj = new M();
		obj.test(23, 40);
		System.out.println("done");
	}
}
//if return type is int then it overrided with int 
//if it void then it overrided with void 
//compilation error