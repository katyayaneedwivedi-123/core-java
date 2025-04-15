class H 
{
	int a;
	void test()
	{
		System.out.println("test:" + a);//System.out.println("test:" + this.a);
		a = 30;//this.a = 30;
	}
	public static void main(String[] args) 
	{
		H h1 = new H();
		h1.a = 15;
		System.out.println("main1:" + h1.a);
		h1.test();
		System.out.println("main2:" + h1.a);
	}
}
