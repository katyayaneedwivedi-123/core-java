class U
{
	public static void main(String[] args) 
	{
		int i = 0;
		System.out.println((++i == i++) && (i++ == i++));	//	false
		System.out.println(i);	//	4 
	}
}
