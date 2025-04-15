class A
{
	static void test(int i, int j)
	{
		System.out.println("A-test");
	}
}
class L extends A 
{
	static void test(int p, int q)
	{
		System.out.println("I-test");
	}
	public static void main(String[] args) 
	{
		L obj = new L();
		obj.test(23, 40);
		System.out.println("done");
	}
}
/*I-test
done*/