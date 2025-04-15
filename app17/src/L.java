class L
{
	public static void main(String[] args) 
	{
		int i = 13;
		switch (i)
		{
		case 2:
			System.out.println("from case 2");
			break;
		case 5:
			System.out.println("from case 5");
			break;
			System.out.println("from case 5");//b/c of this it give compilation error			
		case 12:
			System.out.println("from case 12");
			break;
		case 13:
			System.out.println("from case 13");
		}
	}
}
// compilation error