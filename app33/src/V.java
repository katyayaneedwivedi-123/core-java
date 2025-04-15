class V 
{
	int i;
	static void test1(V v1)
	{
		System.out.println("test1 begin:" + v1.i);
		v1.i += 5;
		System.out.println("test1 end:" + v1.i);
	}
	static void test2(V v1)
	{
		System.out.println("test2 begin:" + v1.i);
		v1.i += 5;
		System.out.println("test2 end:" + v1.i);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		V obj = new V();
		obj.i += 5;
		System.out.println("main1:" + obj.i);
		test1(obj);
		obj.i += 15;
		System.out.println("main2:" + obj.i);
		test2(obj);
		System.out.println("main end:" + obj.i);
	}
}
