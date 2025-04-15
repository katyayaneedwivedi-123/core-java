class C
{
	public static void main(String[] args) 
	{
		int i = 10;
		do
		{
			System.out.println("from body:" + i);
			i++;
		}
		while (i <= 5)// ; is important in dowhile
		System.out.println("main end:" + i);
	}
}
// compilation error b/c of ; in while