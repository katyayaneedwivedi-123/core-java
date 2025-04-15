class Z1
{
	public static void main(String[] args) 
	{
		int i = 1;
		for(; ; )//; ; is mandatory
		{
			System.out.println("loop body begin for " + i++);
		}
	}
}
//it give the infinite loop
// so use of ctrl+c used to stop the compiler