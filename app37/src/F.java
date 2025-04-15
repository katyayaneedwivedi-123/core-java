class F 
{
	F()
	{
		System.out.println("F():" + this);//this is reference to f1
	}
	
	{
		System.out.println("IIB:" + this);//this is reference to f1
	}
	
	void test()
	{
		System.out.println("test:" + this);//this is reference to f1
	}
	
	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println("main:" + f1);
		f1.test();
	}
}
/*
IIB:F@4517d9a3
F():F@4517d9a3
main:F@4517d9a3
test:F@4517d9a3
*/
//this is a defualt reference variable which is available in every nonstatic definition block
//this is nothing but reference a current object