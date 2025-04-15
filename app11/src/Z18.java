class Z18
{
	public static void main(String[] args) 
	{
		{
			int i = 20;	
			System.out.println(i);	//	i is local to inside the block not outside 
		}
		{
			i++;	//	i is not used outside block
		}
		System.out.println("done");
	}
}
	//	compilation error