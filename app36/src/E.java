class E
{
	E()
	{
		System.out.println("E()");
	}
	
	{
		System.out.println("E-IIB1");
	}
	
	E(int i)
	{
		System.out.println("E(int i)");
	}
	
	{
		System.out.println("E-IIB2");
	}
	
	E(int i, int j)
	{
		System.out.println("E(int i, int j)");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		E e1 = new E(10);
		System.out.println("----------");
		E e2 = new E();
		System.out.println("----------");
		E e3 = new E(10, 30);
		System.out.println("----------");
		System.out.println("main end");
	}
}