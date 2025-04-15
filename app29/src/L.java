class L
{
	static int i;
	static int j = i;//indirect read
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}