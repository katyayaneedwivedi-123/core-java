class W
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++	+	i	+	i ++	+	i;
			//	0		1		1			2
		System.out.println(i);	//2
		System.out.println(j);	//4
	}
}
	// in java all operator left to right