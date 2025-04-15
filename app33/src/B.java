class B
{
	void test()//non static 
	{
	}
	
	public static void main(String[] args) 
	{
		test();//test can not be referenced from the static context 
		System.out.println("Hello World!");
	}
}
//compilation error