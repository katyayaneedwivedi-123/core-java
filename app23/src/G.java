class G
{
	public static void main(String[] args) 
	{
		int i = 1;
		do
		{
			System.out.println("body begin:" + i);
		}
		while (i++ <= 5);
		System.out.println("main end:" + i);
	}
}