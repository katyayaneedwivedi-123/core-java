class A 
{
	static int i;
	
	static
	{
		System.out.println(i);//direct read
		i = 10;//direct write
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
