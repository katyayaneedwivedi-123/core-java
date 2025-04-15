class R
{
	public static void main(String[] args) 
	{
		System.out.println(1);	//	1
		if(true)
		{
			System.out.println(21);	//	21
			System.out.println(26);	//	26
				if(true)
					{
						if(false)
							{
								System.out.println(31);
								System.out.println(32);
								System.out.println(33);
								System.out.println(34);
								System.out.println(35);
							}
					}
		}
		
		System.out.println(4);	//	4
	}
}
