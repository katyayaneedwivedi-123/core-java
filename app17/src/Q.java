class Q
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
			System.out.println("from default");// from default
		case 2:
			{
				System.out.println("from case 2");// from case 2
				break;
			}
		case 3:
			System.out.println("from case 3");
			break;
		}
		System.out.println("end");//end
	}
}
// b/c the after od default no break break is in case 2 then it print case 2 default and end also
//default can be develope anywhere in switch body