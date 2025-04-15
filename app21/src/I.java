class I 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 5; i++);
		{
			System.out.println("body-stmt1" + i);
			System.out.println("body-stmt2" + i);
			System.out.println("body-stmt4");
		}
		System.out.println("body-end");
	}
}
//compilation error i is local to inside not to outside