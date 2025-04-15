class P 
{
	public static void main(String[] args) 
	{
		int i = 0;
		System.out.println(true || (i++ == i++));	//	true
		System.out.println(i);	//	0
	}
}
