class D 
{
	static int test() 
	{
		System.out.println("test");
		return 20;//in this we give int value so it convert int to double
		//not a byte and short they is a narrow than int
	}
	public static void main(String[] args) 
	{
		//byte v1 = test();//it give error b/c the right hand side is wider
		//short v2 = test();//it give error b/c the right hand side is wider
		int v3 = test();
		long v4 = test();
		float v5 = test();//float v5 = (float) test();
		double v6 = test();
		System.out.println("done");
	}
}
//if we supply a v1 and v2 then it give error
//otherwise it run successfully