class Z2
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = i--	+	i--	+	i--	+	i--	+	i;
			//	5		4		3		2		1
		System.out.println(i);	//1
		System.out.println(j);	//15
	}
}
