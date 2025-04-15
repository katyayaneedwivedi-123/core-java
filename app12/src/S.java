class S
{
	public static void main(String[] args) 
	{
		System.out.println(1);	//	1
		int i = 0;
		if(i == i++)
				{
					System.out.println(i);	//	1
					System.out.println(++i == i--);	//	true
					if((++i == ++i) ||(i == i++))
						{
							System.out.println(i++);	//	4	
							System.out.println(--i);	//	4
							if(false)
							{
								System.out.println(i);	
							}
						}		
				}
		System.out.println(4);	//	4
	}
}
