class W 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("pls supply one command line arg");
			return;
		}
		String s1 = args[0];
		System.out.println("command line arg:"+ s1);
	}
}
//line 10 and 11 is depend on return