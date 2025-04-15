class W
{
	int i;
	static void test1(W w1)
	{
		System.out.println("test1 begin:" + w1.i);
		w1.i += 10;
		System.out.println("test1 end:" + w1.i);
	}
	static void test2(W w1)
	{
		System.out.println("test2 begin:" + w1.i);
		w1.i += 5;
		test1(w1);
		System.out.println("test2 end:" + w1.i);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		W obj = new W();
		obj.i += 5;
		System.out.println("main1:" + obj.i);
		test1(obj);
		System.out.println("main2:" + obj.i);
		obj.i += 15;
		test2(obj);
		System.out.println("main end:" + obj.i);
	}
}
