class R
{
	public static void main(String[] args) 
	{
		int i = 0;
		System.out.println((++i == i++) || (i++ == i++));	//	true
		System.out.println(i);	//	2 b/c first is true then second is not executed
	}
}
