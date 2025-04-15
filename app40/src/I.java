class A
{
	private A()
	{
	}
}
class I extends A 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//compilation error
// A default construcotr develop by the compiler
// eventhough we are not creating object for i and a so we are not using i statement it get error