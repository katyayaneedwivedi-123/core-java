class S 
{
	int i;
	
	static void test()
	{
		S s1 = new S();//object can be created in any method
		System.out.println(s1.i);
		s1.i = 20;
		System.out.println(s1.i);
	}
	public static void main(String[] args) 
	{
		test();
		System.out.println("done");
	}
}
