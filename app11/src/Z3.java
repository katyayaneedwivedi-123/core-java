class Z3 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		int i = 10;
		if(i++ == i)
		{
			System.out.println(2);
			System.out.println(i);
			i++;
		}
		System.out.println(3);
		System.out.println(i);
	}
}
