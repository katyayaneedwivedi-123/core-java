class N
{
	static int i = N.j;//indirect read
	static int j;
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}