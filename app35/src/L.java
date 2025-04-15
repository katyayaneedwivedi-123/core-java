class L 
{
	L()
	{
		this(90);
	}
	L(int i)
	{
		this();
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//compilation error
//cyclic invocation are not allow in this calling statement 