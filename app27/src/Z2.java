class Z2 
{
	static int i = 10;
	
	i++;
	
	System.out.println(i);
	
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
//compilation error b/c the i++ not in inside of println