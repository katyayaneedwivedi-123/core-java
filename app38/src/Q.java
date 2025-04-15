class Q 
{
	Q()
	{
		super (10);//if we not provide the value in super so it compile successfully
		System.out.println("Q()");
	}
	public static void main(String[] args) 
	{
		Q q1 = new Q();
		System.out.println("done");
	}
}
//object class containing only no argument constractor
//compilation error