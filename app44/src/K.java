class A
{
	public void test(int i, int j)
	{
		System.out.println("A-test");
	}
}
class K extends A 
{
	void test(int p, int q)
	{
		System.out.println("I-test");
	}
	public static void main(String[] args) 
	{
		K obj = new K();
		obj.test(23, 40);
		System.out.println("done");
	}
}
//error b/c K is protected and A is public