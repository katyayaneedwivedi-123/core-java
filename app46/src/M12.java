class M12
{
	public static void main(String[] args) 
	{
		B b1 = new D();//this statement is very proper
		C c1 = (C) b1;
		D d1 = (D) b1;
		D d2 = (D) c1;
		System.out.println("Hello World!");
	}
}
//all the statement is explicit down casting
//only line 5 is up casting
//compile successfully