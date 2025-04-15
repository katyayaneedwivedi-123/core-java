class P
{
	public static void main(String[] args) 
	{
		int i = 7;
		switch (i)
		{
		case 1:
			System.out.println("from case 1");
			break;
		case 2:
			{
				System.out.println("from case 2");
				break;
			}
		case 3:
			System.out.println("from case 3");
			break;
		default:
			System.out.println("from default");//from default
		}
		System.out.println("end");//end
	}
}
// if the no value is suitable then default is uses 
//default is very recommended at the end