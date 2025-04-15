class Z
{
	public static void main(String[] args) 
	{
		int i = 1;
		for(; ; )
		{
			System.out.println("loop body begin for " + i++);
		}
		System.out.println("main end" + i);
	}
}
//compilation error b/c of boolean expression