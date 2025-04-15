class X 
{
	int i;
	static X test()
	{
		X x1 = new X();
		x1.i = 20;
		System.out.println("test:" + x1.i);
		return x1;
	}
	public static void main(String[] args) 
	{
		X obj = test();
		System.out.println("main:" + obj.i);
	}
}
