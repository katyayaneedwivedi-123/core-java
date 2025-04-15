class I 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 3; i++)
		{
		int j = 20;
		System.out.println("loop body:" + i + "," + j);
		j += 5;
		System.out.println("loop body:" + i + "," + j);
		System.out.println("-------------");
		}
		System.out.println("main end");
	}
}