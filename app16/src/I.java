class I 
{
	public static void main(String[] args) 
	{
		if(args.length < 2)
		{
			System.out.println("supply 2 int type command line arguments");
			return;
			//ensuring minimum 2 command line argument
		}
	String s1 = args[0];
	String s2 = args[1];
	//storing command line argument as string
	int i = Integer.parseInt(s1);
	int j = Integer.parseInt(s2);
	//string is a binary content , and 2 require
	//it convert string in number
	int min = (i < j) ? i : j;
	int max = (i > j) ? i : j;
	//give ternary operation b/c of min and max
	System.out.println("min value b/w" + i + "," + j + ":" + min);
	System.out.println("max value b/w" + i + "," + j + ":" + max);
	}
}
