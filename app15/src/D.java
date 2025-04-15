class D
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
			if(true)
			{
				System.out.println(4);//4
			}
		}
		System.out.println(6);//6
	}
}
// in else block the if condition is here so it give the if condition value as o/p