class V 
{
	public static void main(String[] args) 
	{
		int i = 10;
		int j = 10;
		switch(i)
		{
			case 4:
				System.out.println("from case 4");
				break;
			case j:
				System.out.println("from case 10");
				break;
		}
		System.out.println("end");
	}
}
// case should have always constant expression result not a variable result
// compilation error