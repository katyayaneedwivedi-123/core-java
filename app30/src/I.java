class T
{
	static
	{
		System.out.println("T-sib");
	}
	
	static int i;
	
	static void t1()
	{
		System.out.println("T-t1");
	}
}
class I
{
	static
	{
		System.out.println("I-sib");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(T.i);
		System.out.println("-------");
		System.out.println(T.i);
		System.out.println("-------");
		System.out.println(T.i);
		System.out.println("-------");
		T.t1();
		T.t1();
		T.t1();
		T.t1();
		T.t1();
		System.out.println("main end");
	}
}
/*
I-sib
main begin
T-sib
0
-------
0
-------
0
-------
T-t1
T-t1
T-t1
T-t1
T-t1
main end
*/