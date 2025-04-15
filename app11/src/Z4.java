class Z4
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		int i = 10;
		if(i++ == i++)	//	if is false so it not executed
		{
			System.out.println(2);
			System.out.println(i);
			i++;
		}
		System.out.println(3);
		System.out.println(i);	//	but i become 12 then o/p is 12
	}
}
