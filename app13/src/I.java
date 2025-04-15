class I
{
	public static void main(String[] args) 
	{
		int i = 30;
		if(false)
		{
			System.out.println(1);
			System.out.println(i);
			i += 30;
		}
		else
		{
			System.out.println(21);//21
			System.out.println(22);//22
			System.out.println(i);//30
			i++;
			System.out.println(i);//31
		}
		System.out.println(3);//3
		System.out.println(i);//31
	}
}