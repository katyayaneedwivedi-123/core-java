class X 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		if(true)
		{
			int i = 30;
			System.out.println("if:" + i);
		}
		System.out.println("main end:" + i);
	}
}
//both are local and again we initialize so it give error