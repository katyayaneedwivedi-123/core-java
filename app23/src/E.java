class E
{
	public static void main(String[] args) 
	{
		int i = 1;
		do
		{
			System.out.println("body begin:" + i);
			if(i == 3)
			{
				continue;
			}
			System.out.println("body end:" + i);
			i++;
		}
		while (i <= 5);
		System.out.println("main end:" + i);
	}
}
// it give compilation error b/c the changes in anywhere no fixed location for the chnages
// it direct continue goto the boolean condition so it print the infinite time execution 