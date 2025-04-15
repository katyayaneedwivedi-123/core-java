class C
{
	public static void main(String[] args) 
	{
		System.out.println(1);//1
		if(false)
		{
			System.out.println(2);
		}
		else
		{
			System.out.println(31);//31
			System.out.println(32);//32
			if(true)
			{
				System.out.println(4);//4
			}
			System.out.println(51);//51
			System.out.println(52);//52
		}
		System.out.println(6);//6
	}
}
