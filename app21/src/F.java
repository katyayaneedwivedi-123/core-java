class F 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5; i++)
			System.out.println("body-stmt1");//body containing only one statement so it print 1 and 1 again and other print only one time
			System.out.println("body-stmt2");
			System.out.println("body-stmt3");
			System.out.println("body-stmt4");
		System.out.println("body-end");
	}
}
