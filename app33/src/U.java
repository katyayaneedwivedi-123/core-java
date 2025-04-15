class U 
{
	int i;
	public static void main(String[] args) 
	{
		U u1 = new U();
		System.out.println("main1:" + u1.i);
		u1.i = 10;
		System.out.println("main2:" + u1.i);
		test(u1);//u1 can not used outside
		System.out.println("main3:" + u1.i);
	}
	static void test(U ref)
	{
		System.out.println("test:" + ref.i);//ref is parameter to test
		ref.i = 20;
	}
}
/*
main1:0
main2:10
test:10
main3:20
*/
//this memory is formatting and returning back to operating system(stack)