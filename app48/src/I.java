class I 
{
	int a;
	public static void main(String[] args) 
	{
		final I obj = new I();
		obj = new I();
		System.out.println("done");
	}
}
//compilation error
//obj is final so we can not do the modification in obj 
//we can do the modification in a
//no matter a is modify or not obj is final