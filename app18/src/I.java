class I
{
	public static void main(String[] args) 
	{
		short b1 = 10;
		switch(b1)
		{
			case 5:
				System.out.println("from cases5");
				break;
			case 10:
				System.out.println("from cases10");
				break;
			case 140:
				System.out.println("from cases140");
				break;
			case 50000:
				System.out.println("from cases140");//compilation error
				break;
		}
		System.out.println("end");
		
	}
} 
// 50000 is not the short value b/c it is more than the short range

