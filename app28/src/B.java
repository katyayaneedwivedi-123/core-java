class B
{
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
	
	static
	{
		System.out.println("sib");
	}
}
//initializer executing before the main method
/*
sib
main
*/