class Z15
{
	public static void main(String[] args) 
	{
		System.out.println(1);	//	1
		{
			System.out.println("block1-stmt1");	//	block1-stmt1 
			System.out.println("block1-stmt2"); //	block1-stmt2
			System.out.println("block1-stmt3");	//	block1-stmt3
			System.out.println("block1-stmt3");	//	block1-stmt3
		}
		System.out.println(22);	//	22
		{
			System.out.println("block2-stmt1");	//	block2-stmt1 
			System.out.println("block2-stmt2");	//	block2-stmt2
			System.out.println("block2-stmt3");	//	block2-stmt3
			System.out.println("block2-stmt3");	//	block2-stmt3
		}
		System.out.println(3);	//	3
	}
}
