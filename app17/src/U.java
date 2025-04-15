class U 
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("pls supply one int type command line argument");
			return;
		}
		int i = Integer.parseInt(args[0]);
		switch (i)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println(i + "is odd");
			break;
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.println(i + "is even");
			break;
		default:
			System.out.println("value should be b/w 1 to 10");// it is boundary from 1 to 10
		}
		System.out.println("end");
	}
}
