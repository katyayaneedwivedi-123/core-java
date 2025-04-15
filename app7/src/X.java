class X
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++	+	i	+	i ++	+	i	+	i++	+	i	+	i++	+	i;
			//	0		1		1			2		2		3		3		4
		System.out.println(i);	//4
		System.out.println(j);	//16
	}
}
	// in java all operator left to right