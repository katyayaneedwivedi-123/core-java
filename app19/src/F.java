class F 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 50000; i > 1; i /= 3)// i = i / 3
		{
		System.out.println("loop body:" + i);
		}
		System.out.println("main end");
	}
}