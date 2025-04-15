class H 
{
	public static void main(String[] args) 
	{
		int a = 120;
		byte b = a;
		System.out.println(b);
	}
}
//eventhough a vlaue is range of byte but it give compilation error
//b/c compiler check the type right to left hand side
//compilation erro