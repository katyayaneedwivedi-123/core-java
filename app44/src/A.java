class A 
{
	public static void main(String args) 
	{
		System.out.println("main(String)");
	}
	public static void main(int args) 
	{
		System.out.println("main(int)");
	}
	public static void main() 
	{
		System.out.println("main()");
	}
	public static void main(int i, int j) 
	{
		System.out.println("main(int, int)");
	}
}
/*
main(String[])
*/	
//if we are not use (String[] args) then it compile success but not run 
//it give run time error
//class doesn't require a main method to take String array to compile 
//very successfully 
//it require a main methodvwhich take String array