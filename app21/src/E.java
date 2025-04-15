class E
{
	public static void main(String[] args) 
	{
		outerLoop:
		for (int i = 1; i <= 5; i++ )
		{
			System.out.println("outer loop begin:" + i);
			for(int j = 501; j <= 505; j++)
			{
				System.out.println("inner loop begin with:" + i + "," + j);
				if(j == 503)
				{
					continue outerLoop;
				}
				System.out.println("inner loop end with:" + i + "," + j);
			}
			System.out.println("outer loop end:" + i);
		}
		System.out.println("end");
	}
}
// break abc direct terminate after the break it not print anything