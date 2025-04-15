class I
{
	public static void main(String[] args) 
	{
		System.out.println(1);	//	1
		if(false)
		if(true)	//	is a part of if(false)
		System.out.println(3);	//	so it not executed
		System.out.println(5);	//	5
	}
}
