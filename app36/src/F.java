class F 
{
	F()
	{
		System.out.println("F()");
	}
	{
		System.out.println("F-IIB");
	}
	F(int i)
	{
		this();
		System.out.println("F(int i)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		F f1 = new F();
		System.out.println("--------------------");
		F f2 = new F(20);
		System.out.println("--------------------");
		F f3 = new F(10);
		System.out.println("--------------------");
		System.out.println("main end");
	}
}
/*
main begin
F-IIB
F()
--------------------
F-IIB
F()
F(int i)
--------------------
F-IIB
F()
F(int i)
--------------------
main end
*/
// IIB is executed onetime only eventhough multiple construction executing