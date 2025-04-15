class D
{
	public static void main(String[] args) 
	{
		do
		{
			int i = 10;
			System.out.println("from body:" + i);
			i++;
		}
		while (i <= 5);
		System.out.println("main end:" + i);
	}
}
// compilation error 
// the variable which are declared in the body of do while 
// i is local to do so it give the error