class J 
{
	int i;
	void test()
	{
		System.out.println("test");
	}
	public static void main(String[] args) 
	{
		J j1 = new J();
		System.out.println(j1.i);
		j1.test();
		j1.i = 30;
		System.out.println(j1.i);
		j1.test();
		j1.i = 40;
		System.out.println(j1.i);
	}
}
/*
0
test
30
test
40
*/