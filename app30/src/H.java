
class A
{
	static int i;
	
	static
	{
		System.out.println("A-sib");
	}
}
class H
{
	static
	{
		System.out.println("H-sib");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("-------");
		System.out.println(A.i);
		System.out.println("-------");
		A.i = 45;
		System.out.println(A.i);
		System.out.println("-------");
		System.out.println("main end");
	}
}
/*
H-sib
main begin
A-sib
0
-------
0
-------
45
-------
main end
*/