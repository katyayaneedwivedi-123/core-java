class E
{
	static int i;
	static int j = E.i;	//	indirect read
	
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
