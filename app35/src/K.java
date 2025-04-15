class K 
{
	K()
	{
		this();//recursive not allow 
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//compilation error
//same constructor this calling satement not allow