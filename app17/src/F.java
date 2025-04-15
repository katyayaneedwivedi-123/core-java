class F
{
	public static void main(String[] args) 
	{
		int i = 2;
		switch (i)
		{
		case 2:
			System.out.println("from case 2");	// from case 2
		case 5:
			System.out.println("from case 5");	//	from case 5
			break;
		case 12:
			System.out.println("from case 12");
		case 13:
			System.out.println("from case 13");
		
		}
	}
}
// break is keyword tha terminateing the remaining execution in switchbody
// break should be the end of cases