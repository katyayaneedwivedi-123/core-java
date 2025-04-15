class L
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int p = 10;
		test(p);
		System.out.println("main end:" + p);
	}
	static void test(int i)
	{
		System.out.println("test" + i);
		i = 40;
	}
}
//changes in the i is not reflecting back to p so p is print in both p and i place
/*
main begin
test10
main end:10
*/