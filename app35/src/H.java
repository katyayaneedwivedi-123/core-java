class H 
{
	H()
	{
		System.out.println("H()");
		this(90);//always a first statement in the constructor body
	}
	H(int i)
	{
		System.out.println("H(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//compilation error