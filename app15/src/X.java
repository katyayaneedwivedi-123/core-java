class X
{
	public static void main(String[] args) 
	{
		System.out.println(1);//1
		if(false)
		{
			System.out.println(2);
		}
		if(true)
		{
			System.out.println(4);//4
		}
		else if(false)
		{
			System.out.println(44);
		}
		else
		{
			System.out.println(6);
		}
		System.out.println(66);//66
	}
}