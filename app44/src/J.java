class A
{
	void test(int i, int j)
	{
		System.out.println("A-test");
	}
}
class J extends A 
{
	void test(int p, int q)
	{
		System.out.println("I-test");
	}
	public static void main(String[] args) 
	{
		J obj = new J();
		obj.test(23, 40);
		System.out.println("done");
	}
}
/*
I-test
done
*/