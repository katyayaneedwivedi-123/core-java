class H
{
	public static void main(String[] args) 
	{
		System.out.println(1);//1
		if(false)
		{
			System.out.println(2);
		}
		else
			if(true)
			{
				System.out.println(41);//41
				System.out.println(42);//42
				System.out.println(43);//43
				System.out.println(44);//44
				System.out.println(45);//45
			}
		System.out.println(6);//6
	}
}