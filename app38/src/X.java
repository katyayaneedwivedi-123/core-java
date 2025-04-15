class A
{
	static 
	{
		System.out.println("A-SIB");//first load a super
	}
}




class X extends A 
{
	static
	{
		System.out.println("X-SIB");//second load a sub
	}
	public static void main(String[] args) 
	{
		System.out.println("main");//last this load
	}
}
/*
A-SIB
X-SIB
main
*/