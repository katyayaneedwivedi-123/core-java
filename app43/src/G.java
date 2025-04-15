interface A
{
	int a = 1;
	public int b = 2;
	static int c = 3;
	final int d = 4;
	final static int e = 5;
	final static public int f = 6;
	public final static int g = 7;
	public static final int h = 8;
}
class  G
{
	public static void main(String[] args) 
	{
		System.out.println(A.a);
		System.out.println(A.b);
		System.out.println(A.c);
		System.out.println(A.d);
		System.out.println(A.e);
		System.out.println(A.g);
		System.out.println(A.h);
	}
}
/*
1
2
3
4
5
7
8
*/
//all should be used through interfacing
//