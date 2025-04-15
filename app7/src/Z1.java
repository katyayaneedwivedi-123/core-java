class Z1
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = i--	+	i	+	i--	+	i;
			//	5		4		4		3
		System.out.println(i);	//3
		System.out.println(j);	//16
	}
}
