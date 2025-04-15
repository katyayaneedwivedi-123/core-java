class M 
{
	public static void main(String[] args) 
	{
		int i = 20;
		switch(i)
		{
			case 20:
				System.out.println("from case20");
				break;
			case 21:
				System.out.println("from case21");
				break;
			case 22:
				System.out.println("from case22");
				break;
		}
		System.out.println("Hello World!");
	}
}
//whenever case value is sequential or very clossed sequential then compiler generate table switch
//if case value is very random then compiler generate the lookup switch