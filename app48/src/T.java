class T 
{
	static final int i;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//compilation error
//in static	i might be not initialized 
//final global variable can not be survived with a default value