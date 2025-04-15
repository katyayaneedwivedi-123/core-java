class R 
{
	final int i = 0;
	
	{
		i = 0;
	}
	
	public static void main(String[] args) 
	{
		R r1 = new R();
		System.out.println(r1.i);
	}
}
//compilation error
//it is attemptened to initialized
//we are initialized so it give error