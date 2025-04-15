class I1
{
	public static void main(String[] args) 
	{
		int i = 1;
		while(i <= 5)
		{
			System.out.println("loop body:" + i);
			for(int j = 401; j <= 405; j++)
			{
				System.out.println("inner loop body begin:" + i + "," + j);
				System.out.println("inner loop body end:" + i + "," + j);
			}
			System.out.println("outer loop body end:" + i);
			i++;
		}
		System.out.println("main end:" + i);
	}
}