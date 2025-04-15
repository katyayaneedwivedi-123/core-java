class M6 
{
	static C test()
	{
		return new C();
	}
	public static void main(String[] args) 
	{
		Object o1 = test();
		A a1 = test();
		B b1 = test();
		C c1 = test();
		//D d1 = test();//this line give a error
		System.out.println("done");
	}
}
//compilation error
//b/c return go in C not D so it's error
//if we comment the line 13 so it run successful 
//done