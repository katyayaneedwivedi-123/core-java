class X 
{
	public static void main(String[] args) 
	{
		int i = 10;
		final int j;
		/*
			1000 statements
		*/
		j = 10;
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
//compilation error j is final without initialization b/c the compiler check line no 6 not 7 soit give compiation error 