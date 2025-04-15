class C 
{
	C()
	{
		System.out.println("C()");
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		C c1 = new C();
		System.out.println("--------------");
		C c2 = new C();
		System.out.println("--------------");
		C c3 = new C();
		System.out.println("--------------");
		System.out.println("main end");
	}
}
/*
main begin
IIB
C()
----------------
IIB
C()
----------------
IIB
C()
----------------
main end
*/