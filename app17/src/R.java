class R
{
	public static void main(String[] args) 
	{
		int i = 7;
		switch (i)
		{
		case 1:
			System.out.println("from case 1");
			break;
			default:
			System.out.println("from default");//from default
			break;
		case 2:
			{
				System.out.println("from case 2");
				break;
			}
		case 3:
			System.out.println("from case 3");
			break;
		}
		System.out.println("end");//end
	}
}
//default can be develope anywhere in switch body