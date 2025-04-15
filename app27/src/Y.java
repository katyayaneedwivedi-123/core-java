class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			int i = 30;//it is local to only if
			System.out.println("if:" + i);
		}
		int i = 10;
		System.out.println("main end:" + i);
	}
}