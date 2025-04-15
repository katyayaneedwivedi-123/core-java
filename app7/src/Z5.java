class Z5 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++;	// k = 0, i = 1	
		System.out.println(i);
		System.out.println(j);
		System.out.println("--------------");
		
		i = 0;
		i = i++;	//	k = 0, i = 1
		System.out.println(i);
		System.out.println(j);
		System.out.println("--------------");
	}
}
