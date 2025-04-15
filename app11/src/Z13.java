class Z13
{
	public static void main(String[] args) 
	{
		System.out.println(1);	//	1
		if(false);
		{
			System.out.println(21);	//	21 these line 8 to 12 is not a body of if block
			System.out.println(22);	//	22
			System.out.println(23);	//	23
			System.out.println(24);	//	24
			System.out.println(25);	//	25
		}
		System.out.println(3);	//	3
	}
}
