class N
{
	public static void main(String[] args) 
	{
		int i = 1;
		loop1:
		while(i <= 5)
		{
			System.out.println("loop body:" + i);
			for(int j = 401; j <= 405; j++)
			{
				System.out.println("inner loop body begin:" + i + "," + j);
				if(j == 402)
				{
					continue loop1;
				}
				System.out.println("inner loop body end:" + i + "," + j);
			}
			System.out.println("outer loop body end:" + i);
			i++;
		}
		System.out.println("main end:" + i);
	}
}
// continue loop1 give the infinite execution i is 1 and it direct give the boolean statement not the changes so it give the infintie execution