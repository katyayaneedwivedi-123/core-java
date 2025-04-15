class A
{
	private A()
	{
	}
	A(int i)
	{
	}
}
class O extends A
{
	O()
	{
		super(90);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//super class second constructor is not private so it rum successfully