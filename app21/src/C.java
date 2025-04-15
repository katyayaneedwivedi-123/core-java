class C
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 5; i++ )
		{
			System.out.println("outer loop begin:" + i);
			for(int j = 501; j <= 505; j++)
			{
				System.out.println("inner loop begin with:" + i + "," + j);
				if(j == 503)
				{
					break;
				}
				System.out.println("inner loop end with:" + i + "," + j);
			}
			System.out.println("outer loop end:" + i);
		}
	}
}
