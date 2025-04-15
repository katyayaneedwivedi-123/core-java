class A
{
	private A()
	{
	}
	private A(int i)
	{
	}
}
class J extends A
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//compilation error