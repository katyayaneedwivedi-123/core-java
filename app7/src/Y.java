class Y
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++	+	i++	+	i ++	+	i++	+	i++	+	i++	+	i;
			//	0		1		2			3		4		5		6		
		System.out.println(i);	//6
		System.out.println(j);	//21
	}
}