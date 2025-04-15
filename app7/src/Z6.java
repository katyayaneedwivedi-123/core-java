class Z6 
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = i--;	//	k = 5, i = 4
		System.out.println(i);
		System.out.println(j);
		System.out.println("--------------");
		i = 5;
		i = i--;	//	k = 5, i = 5
		System.out.println(i);
		System.out.println(j);
		System.out.println("--------------");
	}
}
