class F 
{
	public static void main(String[] args) 
	{
		if(false)
		{
			System.out.println(1);
		}
		else
		{
			int i = 30;
			System.out.println(21);//21
			System.out.println(22);//22
			System.out.println(i);//30
			i++;
			System.out.println(i);//31
		}
		System.out.println(3);//3
	}
}
