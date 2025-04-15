class M11 
{
	public static void main(String[] args) 
	{
		B b1 = new D();
		C c1 = b1;
		D d1 = b1;
		D d2 = c1;
		System.out.println("Hello World!");
	}
}
//compilation error
//if rhs superclass then down casting is required