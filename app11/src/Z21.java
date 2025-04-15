class Z21
{
	public static void main(String[] args) 
	{
		if(args.length == 0)	//	length attribute
		{
			System.out.println("supply one command line arg");
			return;
		}
		String s1 = args[0];
		System.out.println("you have supplied one command line arg:" + s1);
	}
}
