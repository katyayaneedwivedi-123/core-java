class C
{
	static
	{
		System.out.println("sib1");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
	
	static
	{
		System.out.println("sib2");
	}
}
/*
sib1
sib2
main
*/