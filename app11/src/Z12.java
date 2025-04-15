class Z12 
{
	public static void main(String[] args) 
	{
		System.out.println(1);	//	1
		if(false);	//	b/c of ; if block is ended on line. line no7 is not a body of if blocks 
			System.out.println(21);	//	21	
			System.out.println(22);	//	22
			System.out.println(23);	//	23
			System.out.println(24);	//	24
			System.out.println(25);	//	25
		System.out.println(3);	//	3
	}
}
