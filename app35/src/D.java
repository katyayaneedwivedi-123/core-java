class D 
{
	D(int i)
	{
		System.out.println("D(int)");
	}
	D(int j)
	{
		System.out.println("D(int j)");
		System.out.println("D(int j)");
		System.out.println("D(int j)");
		System.out.println("D(int j)");
		System.out.println("D(int j)");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//compilation error b/c no of argument same and arg data type same