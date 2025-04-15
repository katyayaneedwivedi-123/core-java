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
class U
{
	static
	{
		System.out.println("U-sib");
	}
	
	static int i;
	
	static void t1()
	{
		System.out.println("U-t1");
	}
}
class J
{
	static
	{
		System.out.println("J-sib");
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
		System.out.println("-----------");
		U.t1();
		U.i = 29;
		System.out.println(U.i);
		System.out.println("main end");
	}
}
/*
J-sib
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
-----------
U-sib
U-t1
29
main end
*/