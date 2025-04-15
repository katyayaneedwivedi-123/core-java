class N 
{
	public static void main(String[] args) 
	{
		int i = 0;
		System.out.println(false || (i++ == i));	//	first operand is false and then the second operand is executed (0 == 1 is false that's the result is false)
		System.out.println(i);	//	1
	}
}
