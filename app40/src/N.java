class N 
{
	private static
	{
	}//sib and iib can not access in private class
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//compilation error
//sib and iib can not access in private class 
//b/c main method class sib and iib. sib and iib always execute 
//first but sib and iib is private so it is syntactically incorrect
