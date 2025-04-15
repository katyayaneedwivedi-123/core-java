class W 
{
	public static void main(String[] args) 
	{
		int i = 10;
		final int j = 10;//final is constant so it give result
		switch(i)
		{
			case 4:
				System.out.println("from case 4");
				break;
			case j:
				System.out.println("from case 10");//from case 10
				break;
		}
		System.out.println("end");//end 
	}
}