class T
{
	public static void main(String[] args) 
	{
		int i = 0;
		System.out.println(true && (i++ == i++));	//	false
		System.out.println(i);	//	2 
	}
}
