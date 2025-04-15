class Z11 
{
	public static void main(String[] args) 
	{
		System.out.println(1);	//	1
		if(false)	//	if block is only this statement 
			System.out.println(21);	//	only this is condition statement(if)
			System.out.println(22);	//	22
			System.out.println(23);	//	23
			System.out.println(24);	//	24
			System.out.println(25);	//	25
		System.out.println(3);	//	3
	}
}
	//	only 7 is not executed but all remaining is executed b/c the {} is not here